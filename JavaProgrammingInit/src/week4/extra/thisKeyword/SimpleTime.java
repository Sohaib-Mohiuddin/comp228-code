package week4.extra.thisKeyword;

public class SimpleTime {
    private int hour, minute, second;

    // No-arg constructor chains to 3-arg via this(...)
    public SimpleTime() {
        this(0, 0, 0);
    }

    // Arg names intentionally match fields to demo this.field
    public SimpleTime(int hour, int minute, int second) {
        // validate quickly (keep it simple for class)
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid time");
        }
        this.hour = hour;      // 'this' disambiguates field vs parameter
        this.minute = minute;
        this.second = second;
    }

    // Demonstrate 'this' in an instance method call
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    @Override
    public String toString() {
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String ampm = hour < 12 ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", displayHour, minute, second, ampm);
    }
}
