package week4.extra.finalKeyword;

public class Student {
    private final StudentId id;     // final: must be set in constructor, cannot be reassigned
    private String name;            // mutable field for contrast

    public Student(StudentId id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentId id() { return id; }
    public String name() { return name; }
    public void rename(String newName) { this.name = newName; }

    @Override public String toString() { return id + " - " + name; }
}
