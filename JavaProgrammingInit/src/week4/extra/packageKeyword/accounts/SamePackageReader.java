package week4.extra.packageKeyword.accounts;

public class SamePackageReader {
    public static void main(String[] args) {
        PackageData pd = new PackageData(); // OK (same package)
        pd.deposit(500);
        System.out.println("Balance (cents): " + pd.balanceCents); // OK
    }
}
