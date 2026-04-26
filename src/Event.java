import java.time.LocalDateTime;

public class Event implements Comparable<Event> {
    public LocalDateTime date;
    public String state;

    public Event(LocalDateTime date, String state) {
        this.date = date;
        this.state = state;
    }

    @Override
    public int compareTo(Event other) {
        int dateComparison = this.date.compareTo(other.date);
        if (dateComparison != 0) {
            return dateComparison;
        }
        return this.state.compareTo(other.state);
    }
}
