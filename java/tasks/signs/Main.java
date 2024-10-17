package tasks.signs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    private static final Map<String, String[]> zodiacIntervals = new HashMap<>() {{
        put("Водолей", new String[]{"21.01", "19.02"});
        put("Рыбы", new String[]{"20.02", "20.03"});
        put("Овен", new String[]{"21.03", "20.04"});
        put("Телец", new String[]{"21.04", "21.05"});
        put("Близнецы", new String[]{"22.05", "21.06"});
        put("Рак", new String[]{"22.06", "22.07"});
        put("Лев", new String[]{"23.07", "21.08"});
        put("Дева", new String[]{"22.08", "23.09"});
        put("Весы", new String[]{"24.09", "23.10"});
        put("Скорпион", new String[]{"24.10", "22.11"});
        put("Стрелец", new String[]{"23.11", "22.12"});
        put("Козерог", new String[]{"23.12", "20.01"});
    }};

    private static final NavigableMap<DateRangeKey, ZodiacSign> preparedIntervals = prepareIntervals();

    public static void main(String[] args) {
        var exampleDate = "22.01.2024";
        var preparedDate = getPreparedDate(exampleDate);

        var result = preparedIntervals.floorEntry(new DateRangeKey(preparedDate, preparedDate)).getValue();

        System.out.println(result.getName());
    }

    private static NavigableMap<DateRangeKey, ZodiacSign> prepareIntervals() {
        var intervals = new TreeMap<DateRangeKey, ZodiacSign>();

        for (var entry : Main.zodiacIntervals.entrySet()) {
            var signName = entry.getKey();
            var startDate = getPreparedDate(entry.getValue()[0]);
            var endDate = getPreparedDate(entry.getValue()[1]);

            if (startDate.isAfter(endDate)) {
                intervals.put(
                        new DateRangeKey(startDate, LocalDate.of(9999, 12, 31)),
                        ZodiacSign.fromName(signName)
                );

                intervals.put(
                        new DateRangeKey(LocalDate.of(9999, 1, 1), endDate),
                        ZodiacSign.fromName(signName)
                );
            } else {
                intervals.put(new DateRangeKey(startDate, endDate), ZodiacSign.fromName(signName));
            }
        }

        return intervals;
    }

    private static LocalDate getPreparedDate(String str) {
        var data = str.split("\\.");
        var day = Integer.parseInt(data[0]);
        var month = Integer.parseInt(data[1]);
        var year = 9999;

        if (data.length == 3 && Integer.parseInt(data[2]) % 4 == 0 && day == 29 && month == 2) {
            day = day - 1;
        }

        return LocalDate.of(year, month, day);
    }
}