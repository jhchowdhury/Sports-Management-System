package Model;

public class Strength {

    private String legStrength;
    private String armStrength;
    private String maxStrength;

    public Strength() {
        legStrength = "";
        armStrength = "";
        maxStrength = "";
    }
    public Strength(String legStrength, String armStrength, String maxStrength) {
        this.legStrength = legStrength;
        this.armStrength = armStrength;
        this.maxStrength = maxStrength;
    }
    public void setLegStrength(String legStrength) {
        this.legStrength = legStrength;
    }
    public void setArmStrength(String armStrength) {
        this.armStrength = armStrength;
    }
    public void setMaxStrength(String maxStrength) {
        this.maxStrength = maxStrength;
    }
    public String getLegStrength() {
        return legStrength;
    }
    public String getArmStrength() {
        return armStrength;
    }
    public String getMaxStrength() {
        return maxStrength;
    }
}
