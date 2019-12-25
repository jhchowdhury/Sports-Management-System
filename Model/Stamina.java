package Model;

public class Stamina {
    private String endurance;
    private int maxStamina;
    private int staminaRecovery;

    public Stamina() {
        endurance = "";
        maxStamina = 0;
        staminaRecovery = 0;
    }
    public Stamina(String endurance, int maxStamina, int staminaRecovery) {
        this.endurance = endurance;
        this.maxStamina = maxStamina;
        this.staminaRecovery = staminaRecovery;
    }
    public void setEndurance(String endurance) {
        this.endurance = endurance;
    }
    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }
    public void setStaminaRecovery(int staminaRecovery) {
        this.staminaRecovery = staminaRecovery;
    }
    public String getEndurance() {
        return endurance;
    }
    public int getMaxStamina() {
        return maxStamina;
    }
    public int getStaminaRecovery() {
        return staminaRecovery;
    }
}
