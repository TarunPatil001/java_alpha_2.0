import java.time.LocalDate;
import java.time.format.*;
import java.util.*;

import javax.swing.text.DateFormatter;

public class dateTime {
    public static void main(String args[]) {

        LocalDate myDateObj = LocalDate.of(2023, 9, 6);
        System.out.println("B F : " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE, dd MM yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("A F : " + formattedDate);
    }
}
