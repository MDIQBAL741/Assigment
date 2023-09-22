package candidateproject.details.Candidate.Repository;

import candidateproject.details.Candidate.Entity.CandidateRegistration;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@Repository
@Transactional
public interface CandidateRepo extends JpaRepository<CandidateRegistration,Integer> {

    @Query(value = "select * from candidate where skills_id in (select skills_id from skills_table where skill = ?1)",
            nativeQuery = true)
    public List<CandidateRegistration> findBySkill(String skills);

    @Modifying
    @Query(value="delete from candidate where email =:email",nativeQuery = true)
    void deleteByemail(@Param("email")String email);

    Optional<Object> findByemail(String email);

    Optional<Object> findByphone(Long phone);
//    @Query(value = "select * from candidate where skill like '%skill%'",nativeQuery = true)
//    @Query(value = "select * from candidate where skill like %:skill% and skill like %:skill%",nativeQuery = true)
//    Optional<List<CandidateRegistration>> findbyskill(String skill);
    @Modifying
    @Query(value = "delete from candidate where phone =:phone",nativeQuery = true)
    void deleteByphone(Long phone);

}
