package candidateproject.details.Candidate.Services;

import candidateproject.details.Candidate.Entity.Panel;
import candidateproject.details.Candidate.Repository.PanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleInterviewServices {
    @Autowired
    PanelRepository panelRepository;
    public List<Panel> getPanelBySkill(String skill) {
        List<Panel> panels= panelRepository.findBySkillId(skill);
        return panels;
    }
}
