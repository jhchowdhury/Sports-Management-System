import Presentation.*;
import java.util.Date;

public class NotificationSystem {
    private int notificationID;
    private int profileID;
    private String content;
    private Date date;

    public NotificationSystem() {
        notificationID = 0;
        profileID = 0;
        content = "";
        date = null;
    }

    public NotificationSystem(int notificationID, int profileID, String content, Date date) {
        this.notificationID = notificationID;
        this.profileID = profileID;
        this.content = content;
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNotificationID() {
        return this.notificationID;
    }

    public int getProfileID() {
        return this.profileID;
    }

    public String getContent() {
        return this.content;
    }

    public Date getDate() {
        return this.date;
    }
}
