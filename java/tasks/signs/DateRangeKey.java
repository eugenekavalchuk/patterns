package tasks.signs;

import java.time.LocalDate;

public record DateRangeKey(LocalDate startDate, LocalDate endDate) implements Comparable<DateRangeKey> {
    @Override
    public int compareTo(DateRangeKey other) {
        int cmp = this.startDate.compareTo(other.startDate);
        if (cmp == 0) {
            return this.endDate.compareTo(other.endDate);
        }
        return cmp;
    }
}
