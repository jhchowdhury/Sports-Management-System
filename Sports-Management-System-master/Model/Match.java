import Model.*;
import java.util.Date;

public class Match {
    private Date date;
    private int time;
    private Team homeTeam;
    private Team awayTeam;
    private String fieldName;
    private String fieldAddress;
    private StatisticsGenerator statisticsGenerator;

    public Match() {
        date = null;
        time = 0;
        homeTeam = null;
        awayTeam = null;
        fieldName = "";
        fieldAddress = "";
    }
    public Match(Date date, int time, Team homeTeam, Team awayTeam, String fieldName, String fieldAddress) {
        this.date = date;
        this.time = time;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.fieldName = fieldName;
        this.fieldAddress = fieldAddress;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
    public Date getDate() {
        return date;
    }
    public int getTime() {
        return time;
    }
    public Team getHomeTeam() {
        return homeTeam;
    }
    public Team getAwayTeam() {
        return awayTeam;
    }
    public String getFieldName() {
        return fieldName;
    }
    public String getFieldAddress() {
        return fieldAddress;
    }
}
