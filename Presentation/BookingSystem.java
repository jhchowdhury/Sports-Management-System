import Presentation.*;
import java.util.Date;

interface BookingSystem {
    public int bookID;
    public Date bookTime;
    public void book();
    public void cancelBook();
    public void updateBook(Date bookTime);
}
