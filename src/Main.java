import Data.BirthdayCalc;
import Data.TimeZoneConverter;

import java.time.*;
import java.util.List;

import static Data.MaxDateList.getMaxDate;
import static Data.unknownFormatt.parseDate;

public class Main {
    public static void main(String[] args) {
        // birthdayCalc
        String birthday = "2001-02-03";
        int daysOfBirthday = BirthdayCalc.getDaysBetweenDate(birthday);
        System.out.println(daysOfBirthday);

        // unknownFormatt
        String str = "2023 07 18";
        LocalDate date = parseDate(str);
        if(date !=null) {
            System.out.println(date);
        } else {
            System.out.println("No found");
        }

        // TimeZoneConverter
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId fromZone = ZoneId.systemDefault();
        ZoneId toZone = ZoneId.of("Asia/Seoul");

        LocalDateTime converter = TimeZoneConverter.convert(dateTime, fromZone, toZone);

        System.out.println(converter);

        // ProgrammTime
        Instant startTime = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant endTime = Instant.now();
        Duration programmTime = Duration.between(startTime, endTime);

        System.out.println(programmTime.getNano());

        // MaxDate
        List<String> dates = List.of("2023-07-18T00:00:00", "2021-06-04T00:00:00", "2009-01-11T00:00:00", "2019-03-20T00:00:00");
        LocalDateTime maxDate = getMaxDate(dates);

        System.out.println(maxDate);

        // LocalDate methods
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        LocalDate plusMonth = localDate.plusMonths(1);
        LocalDate minusMonth = localDate.minusMonths(1);
        LocalDate localDate1 = LocalDate.of(2001, 03, 02);
        System.out.println(localDate);
        System.out.println(year);
        System.out.println(dayOfWeek);
        System.out.println(plusMonth);
        System.out.println(minusMonth);
        System.out.println(localDate1);

    }
}