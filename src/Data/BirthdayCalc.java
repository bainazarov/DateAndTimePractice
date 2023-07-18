package Data;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCalc {
    public static int getDaysBetweenDate(String birthday) {
        LocalDate dateOfBirth = LocalDate.parse(birthday);
        LocalDate currentDate = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(dateOfBirth, currentDate);
    }
}
