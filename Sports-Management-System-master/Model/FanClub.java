import Model.*;

public class FanClub {
    private String[] contactInfos;
    private String donationInfo;

    public FanClub() {
        contactInfos = null;
    }
    public FanClub(String[] contactInfos, String donationInfo) {
        this.contactInfos = contactInfos;
        this.donationInfo = donationInfo;
    }
    public void setContactInfos(String[] contactInfos) {
        this.contactInfos = contactInfos;
    }
    public void setDonationInfo(String donationInfo) {
        this.donationInfo = donationInfo;
    }
    public String[] getContactInfos() {
        return contactInfos;
    }
    public String getDonationInfo() {
        return donationInfo;
    }
}
