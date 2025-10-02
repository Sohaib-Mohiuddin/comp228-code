package week4.extra.composition.models;

public class Name {
    private final String first;
    private final String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }
    @Override public String toString() { return first + " " + last; }
}
