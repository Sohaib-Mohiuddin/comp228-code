package week4.extra.finalKeyword;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student(new StudentId("A00123456"), "Grace Hopper");
        System.out.println(s);

        s.rename("Grace M. Hopper");
        System.out.println("After rename: " + s);

        // s.id = new StudentId("B00999999"); // ❌ compile error: id is final
    }
}
