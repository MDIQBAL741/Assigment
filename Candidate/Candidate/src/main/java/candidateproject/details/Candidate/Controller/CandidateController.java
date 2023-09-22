package candidateproject.details.Candidate.Controller;

import candidateproject.details.Candidate.Dto.CandidateRegistrationDto;
import candidateproject.details.Candidate.Entity.CandidateRegistration;
import candidateproject.details.Candidate.Entity.SkillsList;
import candidateproject.details.Candidate.Handler.FileUploadHandler;
import candidateproject.details.Candidate.Response.ResponseFile;
import candidateproject.details.Candidate.Response.ResponseMessage;
import candidateproject.details.Candidate.ResponseData;
import candidateproject.details.Candidate.Services.CandidateServices;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class CandidateController {
    @Autowired
    CandidateServices candidateServices;
    @Autowired
    FileUploadHandler fileUploadHandler;

    @PostMapping("/addcandidate")
    public ResponseEntity<CandidateRegistration> addCandidate(@Valid @RequestBody CandidateRegistrationDto candidateRegistrationDto){
        return new ResponseEntity<>(candidateServices.addCandidate(candidateRegistrationDto),HttpStatus.CREATED);
    }
    @PostMapping("/addskills")
    public SkillsList addskills(@RequestBody SkillsList skillsList){
        return candidateServices.saveskill(skillsList);
    }
    @GetMapping("/candidate")
    public List<CandidateRegistration> findbyAllCandidate() {
        return candidateServices.getCandidate();
    }
    @GetMapping("/candidate/{email}")
    public CandidateRegistration findbyemail(@PathVariable String email ){
        return candidateServices.findbyemail(email);
    }

    @GetMapping("/candidates/{phone}")
    public CandidateRegistration findbyPhone(@PathVariable Long phone){
        return candidateServices.findbyphone(phone);
    }

    @DeleteMapping("/delete/{email}")
    public String deletebyemail(@PathVariable String email)
    {
        return candidateServices.deletebyemail(email);
    }

    @DeleteMapping("/deletee/{phone}")
    public String deleteByPhone(@PathVariable Long phone)
    {
        return candidateServices.deletebyphone(phone);
    }
    @PutMapping("/candidateupdate")
    public ResponseEntity<CandidateRegistration> update(@Valid @RequestBody CandidateRegistrationDto candidateRegistrationDto){
        return new ResponseEntity<>(candidateServices.updateCandidate(candidateRegistrationDto),HttpStatus.CREATED);
    }
//    @PutMapping(value="/addresume",consumes = {MediaType.MULTIPART_MIXED_VALUE,MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE},
//    produces = {MediaType.MULTIPART_FORM_DATA_VALUE,MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_MIXED_VALUE})
//    public ResponseEntity<CandidateRegistration> updated( @RequestParam("file") MultipartFile file){
//  //      return new ResponseEntity<>(candidateServices.updated(file),HttpStatus.CREATED);
//    }
    @PutMapping("/candidateupdatebyphone")
    public ResponseEntity<CandidateRegistration>updates(@Valid @RequestBody CandidateRegistrationDto candidateRegistrationDto){
        return new ResponseEntity<>(candidateServices.updates(candidateRegistrationDto),HttpStatus.CREATED);
    }
    @GetMapping("/candidateskills/{skills}")
    public List<CandidateRegistration> get(@PathVariable String skills){
        return candidateServices.findBySkill(skills);
    }

//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file){
//        try {
//            if (file.isEmpty()) {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file is empty");
//            }
////            if (!file.getContentType().equals("resume/pdf") || !file.getContentType().equals("resume/doc")){
////                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file should be pdf or doc");
////            }
//
//                boolean f=fileUploadHandler.uploadFile(file);
//                if (f)
//                {
////                    return ResponseEntity.ok("file is uploaded sucessfully");
//                    return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/resume/").path(file.getOriginalFilename()).toUriString());
//                }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong");
//    }
    @PostMapping(value = "/uploading/{email}")
    public ResponseEntity<ResponseMessage> uploadingFile(@RequestParam("file") MultipartFile file,@PathVariable String email) {
        String message = "";
        try {

            CandidateRegistration cr = candidateServices.findbyemail(email);
            if(email.equalsIgnoreCase(cr.getEmail())){
                cr.setResume(file.getBytes());
                candidateServices.updateResume(cr,file);
            }
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @GetMapping("/download/{email}/db")
    public ResponseEntity downloadfromdb(@PathVariable String email){

       CandidateRegistration document= candidateServices.findbyemail(email);
       return (ResponseEntity) ResponseEntity.ok()
               .contentType(MediaType.TEXT_EVENT_STREAM)
               .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + document.getName() + "\"")
               .body(document.getResume());
    }
}
