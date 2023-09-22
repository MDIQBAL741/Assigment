package candidateproject.details.Candidate.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//import java.sql.Time;

@Entity

@Table(name = "Panel")
public class Panel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int panelId;
    @Column(name = "panelName")
    private String panelName;
    private int skillsId;
    @Column(unique = true)
    private String panelEmail;
    @Column(name = "slotsAvailability")
    private boolean slotsAvailability;
    @Column(name = "numberOfSlots")
    private int numberOfSlots;

    @Column(name = "startTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime startTime;
    @Column(name = "endTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
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

    public String getPanelEmail() {
        return panelEmail;
    }

    public void setPanelEmail(String panelEmail) {
        this.panelEmail = panelEmail;
    }

    public boolean isSlotsAvailability() {
        return slotsAvailability;
    }

    public void setSlotsAvailability(boolean slotsAvailability) {
        this.slotsAvailability = slotsAvailability;
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

    public Panel(int panelId, String panelName, int skillsId, String panelEmail, boolean slotsAvailability, int numberOfSlots, LocalTime startTime, LocalTime endTime) {
        this.panelId = panelId;
        this.panelName = panelName;
        this.skillsId = skillsId;
        this.panelEmail = panelEmail;
        this.slotsAvailability = slotsAvailability;
        this.numberOfSlots = numberOfSlots;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Panel() {
    }
}