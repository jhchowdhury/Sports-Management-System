import Model.*;

public class Team {
    private int teamID;
    private String teamName;
    private double teamValue;

    public Team() {
        teamID = 0;
        teamName = "";
        teamValue = 0.0;
    }
    public Team(int teamID, String teamName, double teamValue) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.teamValue = teamValue;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setTeamValue(double teamValue) {
        this.teamValue = teamValue;
    }
}
