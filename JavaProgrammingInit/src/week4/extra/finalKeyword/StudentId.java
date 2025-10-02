package week4.extra.finalKeyword;

import java.util.Objects;

public class StudentId {
    private final String value;

    public StudentId(String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("empty id");
        this.value = value;
    }

    public String value() { return value; }

    @Override public String toString() { return value; }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentId sid)) return false;
        return value.equals(sid.value);
    }
    @Override public int hashCode() { return Objects.hash(value); }
}
