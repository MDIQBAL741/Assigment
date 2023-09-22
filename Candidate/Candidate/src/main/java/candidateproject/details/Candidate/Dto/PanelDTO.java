package candidateproject.details.Candidate.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class PanelDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int panelId;
    @NotNull(message = "Panel Name shouldn't be Null")
    private String panelName;

    private int skillsId;
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(unique = true)
    private String PanelEmail;
    @NotNull
    private boolean slotsAvailability;
    @NotNull
    private int numberOfSlots;
    @NotNull
    private LocalTime startTime;
    @NotNull
    private LocalTime endTime;


    public int getPanelId() {
        return panelId;
    }

    public void setPanelId(int panelId) {
        this.panelId = panelId;
    }

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public int getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    public boolean isSlotsAvailability() {
        return slotsAvailability;
    }

    public void setSlotsAvailability(boolean slotsAvailability) {
        this.slotsAvailability = slotsAvailability;
    }

    public String getPanelEmail() {
        return PanelEmail;
    }

    public void setPanelEmail(String panelEmail) {
        this.PanelEmail = panelEmail;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public PanelDTO() {
    }

    public PanelDTO(int panelId, String panelName, int skillsId, String panelEmail, boolean slotsAvailability, int numberOfSlots, LocalTime startTime, LocalTime endTime) {
        this.panelId = panelId;
        this.panelName = panelName;
        this.skillsId = skillsId;
        PanelEmail = panelEmail;
        this.slotsAvailability = slotsAvailability;
        this.numberOfSlots = numberOfSlots;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
