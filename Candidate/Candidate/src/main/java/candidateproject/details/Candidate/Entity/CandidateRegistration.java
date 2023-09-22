package candidateproject.details.Candidate.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="candidate")
public class CandidateRegistration {
    private String candidateType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidateId")
    private int candidateId;
    private String employeeID;
    private String name;
    @Column(unique = true)
    private String email;
//    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name="skillsId")
//    private List<SkillsList> skillslists=new ArrayList<>();

//    private String skill;
//    private String[] skill;
    private int skillsId;
    private int level;
    @Column(unique = true)
    private Long phone;
    private int experience;
    private String baselocation;
    private String preferedloaction;

    private boolean isExternal;
    private float currentctc;
    private float expectedctc;
    private int noticePeriod;
    @Column(unique = true)
    private String pancard;
    private String status;
    @Column(length = 100)
    private String comment;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] resume;

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    public CandidateRegistration() {

    }


    public CandidateRegistration(String fileName, String name, String contentType, byte[] bytes) {
        this.name=name;
        this.resume=bytes;
    }

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public CandidateRegistration(String candidateType, int candidateId, String employeeID, String name, String email, int skillsId, int level, Long phone, int experience, String baselocation, String preferedloaction, boolean isExternal, float currentctc, float expectedctc, int noticePeriod, String pancard, String status, String comment, byte[] resume) {
        this.candidateType = candidateType;
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

