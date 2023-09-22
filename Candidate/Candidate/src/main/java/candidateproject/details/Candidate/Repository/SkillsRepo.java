package candidateproject.details.Candidate.Repository;

import candidateproject.details.Candidate.Entity.SkillsList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<SkillsList,Integer> {
}
