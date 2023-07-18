package Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneConverter {
    public static LocalDateTime convert(LocalDateTime dateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime fromZoneDate = dateTime.atZone(fromZone);
        ZonedDateTime toZoneDate = fromZoneDate.withZoneSameInstant(toZone);
        return toZoneDate.toLocalDateTime();
    }
}
