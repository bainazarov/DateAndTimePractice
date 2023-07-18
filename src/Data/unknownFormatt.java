package Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class unknownFormatt {
    public static LocalDate parseDate(String date) {
        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("dd.MM.yyyy"),
                DateTimeFormatter.ofPattern("MM.dd.yyyy"),
                DateTimeFormatter.ofPattern("yyyy.MM.dd"),
                DateTimeFormatter.ofPattern("yyyy/MM/dd"),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("MM/dd/yyyy"),
                DateTimeFormatter.ofPattern("dd MM yyyy"),
                DateTimeFormatter.ofPattern("MM dd yyyy"),
                DateTimeFormatter.ofPattern("yyyy MM dd")
        };
        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDate.parse(date, formatter);
            } catch (Exception e) {
            }
        }
        return null;
    }
}
