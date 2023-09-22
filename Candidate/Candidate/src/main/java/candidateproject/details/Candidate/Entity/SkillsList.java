package candidateproject.details.Candidate.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="skillsTable")
public class SkillsList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int skillsId;
    private String skill;
//    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "skillsId")
//    private List<CandidateRegistration> candidateRegistrations;

    public int getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
