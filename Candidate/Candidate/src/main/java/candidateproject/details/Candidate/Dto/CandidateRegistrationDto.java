package candidateproject.details.Candidate.Dto;
import candidateproject.details.Candidate.Entity.SkillsList;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class CandidateRegistrationDto {
    private int candidateId;
    private String employeeID;
    @NotNull(message = "user name not be null")
    private String name;
    @NotNull(message = "email can't be null")
    @Email(message = "invalid email")
    private String email;
//    @NotNull(message = "skill can't be null")
//    @JoinColumn(name="skillsId")
//    private List<SkillsList> skillslists = new ArrayList<>();
//    private String skill;
//    private String[] skill;
    @Positive(message = "skills can't be null")
    private int skillsId;
    private int level;
    @NotNull(message = "phone can't ne null")
    @Pattern(regexp = "^[0-9]{10}$", message = "invalid phone no")
    private String phone;
    @NotNull(message = "required experiance")
    private String experience;
    private String baselocation;

    private String preferedloaction;

    private boolean isExternal;
    @NotNull(message = "current ctc needs to be filled")
    private float currentctc;
    @NotNull(message = "expected ctc needs to be filled")
    private float expectedctc;
    private int noticePeriod;
    @NotNull(message = "pancard can't be null")
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}",message = "invalid Pan")
    private String pancard;
    private String status;
    @Column(length = 100)
    private String comment;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] resume;

    public CandidateRegistrationDto() {
        
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public int getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getBaselocation() {
        return baselocation;
    }

    public void setBaselocation(String baselocation) {
        this.baselocation = baselocation;
    }

    public String getPreferedloaction() {
        return preferedloaction;
    }

    public void setPreferedloaction(String preferedloaction) {
        this.preferedloaction = preferedloaction;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public float getCurrentctc() {
        return currentctc;
    }

    public void setCurrentctc(float currentctc) {
        this.currentctc = currentctc;
    }

    public float getExpectedctc() {
        return expectedctc;
    }

    public void setExpectedctc(float expectedctc) {
        this.expectedctc = expectedctc;
    }

    public int getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(int noticePeriod) {
        noticePeriod = noticePeriod;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CandidateRegistrationDto(int candidateId, String employeeID, String name, String email, int skillsId, int level, String phone, String experience, String baselocation, String preferedloaction, boolean isExternal, float currentctc, float expectedctc, int noticePeriod, String pancard, String status, String comment, byte[] resume) {
        this.candidateId = candidateId;
        this.employeeID = employeeID;
        this.name = name;
        this.email = email;
        this.skillsId = skillsId;
        this.level = level;
        this.phone = phone;
        this.experience = experience;
        this.baselocation = baselocation;
        this.preferedloaction = preferedloaction;
        this.isExternal = isExternal;
        this.currentctc = currentctc;
        this.expectedctc = expectedctc;
        this.noticePeriod = noticePeriod;
        this.pancard = pancard;
        this.status = status;
        this.comment = comment;
        this.resume = resume;
    }
}
