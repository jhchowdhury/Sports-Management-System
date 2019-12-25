import Presentation.*;
import java.util.Date;

interface BookingSystem {
    int bookID = 0;
    Date bookTime = new Date();

    public String book();

    public String cancelBook();

    public String updateBook(Date bookTime);
}
