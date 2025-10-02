package week4.extra.thisKeyword;

public class ThisKeywordDemo {
    public static void main(String[] args) {
        SimpleTime t1 = new SimpleTime();           // 00:00:00
        SimpleTime t2 = new SimpleTime(13, 27, 6);  // 13:27:06

        System.out.println("t1 (24h): " + t1.toUniversalString());
        System.out.println("t1 (12h): " + t1);

        System.out.println("t2 (24h): " + t2.toUniversalString());
        System.out.println("t2 (12h): " + t2);
    }
}
