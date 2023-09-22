package candidateproject.details.Candidate.Controller;

import candidateproject.details.Candidate.Entity.Panel;
import candidateproject.details.Candidate.Services.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class ScheduleInterviewController {
    @Autowired
    PanelService panelService;
    @GetMapping("panelskill/{skill}")
    public List<Panel> findBySkillId(@PathVariable("skill") String skill){
        return  panelService.getPanelBySkill(skill);
    }
}
