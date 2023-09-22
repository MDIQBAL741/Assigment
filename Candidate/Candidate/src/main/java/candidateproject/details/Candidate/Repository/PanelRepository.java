package candidateproject.details.Candidate.Repository;

import candidateproject.details.Candidate.Entity.Panel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PanelRepository extends JpaRepository<Panel, Integer> {
    Panel findByPanelEmail(String panelEmail);

    @Query(value = "select * from Panel where skills_id in (select skills_id from skills_table where skill = ?1)",
            nativeQuery = true)
    public List<Panel> findBySkillId(String skill);
}