package candidateproject.details.Candidate.Services;

import candidateproject.details.Candidate.Dto.CandidateRegistrationDto;
import candidateproject.details.Candidate.Entity.CandidateRegistration;
import candidateproject.details.Candidate.Entity.SkillsList;
import candidateproject.details.Candidate.Repository.CandidateRepo;
import candidateproject.details.Candidate.Repository.SkillsRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class CandidateServices {
    @Autowired
    CandidateRepo candidateRepo;
    @Autowired
    SkillsRepo skillsRepo;
    @Autowired
    private ModelMapper modelMapper;


    public CandidateRegistration addCandidate(CandidateRegistrationDto candidateRegistrationDto) {
//        Optional<Object> c=candidateRepo.findByemail(candidateRegistrationDto.getEmail());
//        if (!c) {
            CandidateRegistration candidate = modelMapper.map(candidateRegistrationDto, CandidateRegistration.class);
            return candidateRepo.save(candidate);
    }

    public SkillsList saveskill(SkillsList skillsList) {

        return skillsRepo.save(skillsList);
    }

    public CandidateRegistration findbyemail(String email) {
        return (CandidateRegistration) candidateRepo.findByemail(email).orElse(null);
    }
    public CandidateRegistration findbyphone(Long phone) {
        return (CandidateRegistration) candidateRepo.findByphone(phone).orElse(null);
    }
    public String deletebyemail(String email) {
        candidateRepo.deleteByemail(email);
        return "removed " + email;
    }
    public String deletebyphone(Long phone) {
        candidateRepo.deleteByphone(phone);
        return "removed this details";
    }
    public CandidateRegistration updateCandidate(CandidateRegistrationDto candidateRegistrationDto) {
        CandidateRegistration candidate = modelMapper.map(candidateRegistrationDto, CandidateRegistration.class);
        CandidateRegistration existing = (CandidateRegistration) candidateRepo.findByemail(candidate.getEmail()).orElse(new CandidateRegistration());
        existing.setPhone(candidate.getPhone());
        existing.setNoticePeriod(candidate.getNoticePeriod());
        existing.setStatus(candidate.getStatus());
        existing.setComment(candidate.getComment());
        return candidateRepo.save(existing);
    }
    public CandidateRegistration updateResume(CandidateRegistration candidate,MultipartFile file){
    //    CandidateRegistration candidate=modelMapper.map(candidateRegistrationDto,CandidateRegistration.class);
        CandidateRegistration existing= (CandidateRegistration) candidateRepo.findByemail(candidate.getEmail()).orElse(new CandidateRegistration());
        existing.setResume(candidate.getResume());
        return candidateRepo.save(existing);
    }
    public CandidateRegistration updates(CandidateRegistrationDto candidateRegistrationDto) {
        CandidateRegistration candidate=modelMapper.map(candidateRegistrationDto,CandidateRegistration.class);
        CandidateRegistration existing= (CandidateRegistration) candidateRepo.findByphone(candidate.getPhone()).orElse(new CandidateRegistration());
        existing.setNoticePeriod(candidate.getNoticePeriod());
        existing.setStatus(candidate.getStatus());
        existing.setComment(candidate.getComment());
        return candidateRepo.save(existing);
    }
    public List<CandidateRegistration> getCandidate() {
        return candidateRepo.findAll();
    }

    public List<CandidateRegistration> findBySkill(String skills) {

        List<CandidateRegistration> candidateRegistrations = candidateRepo.findBySkill(skills);

        return candidateRegistrations;
    }
    public CandidateRegistration store(MultipartFile file,String email) throws IOException {
//        candidateRepo.findByemail(email);
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        CandidateRegistration FileDB = new CandidateRegistration(fileName,file.getName(),file.getContentType(),file.getBytes());

        return candidateRepo.save(FileDB);
    }

    public CandidateRegistration getFile(String email) {
        return candidateRepo.findById(Integer.valueOf(email)).get();
    }

    public Stream<CandidateRegistration> getAllFiles() {
        return candidateRepo.findAll().stream();
    }

}
