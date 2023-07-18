package Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MaxDateList {
    public static LocalDateTime getMaxDate(List<String> dates) {
        return dates.stream()
                .map(LocalDateTime::parse)
                .max(LocalDateTime::compareTo)
                .orElse(null);
    }
}
