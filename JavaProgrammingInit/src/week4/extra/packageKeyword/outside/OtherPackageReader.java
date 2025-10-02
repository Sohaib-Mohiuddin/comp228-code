package week4.extra.packageKeyword.outside;

// import week4.extra.packageKeyword.accounts.PackageData; // ❌ Not visible: class is package-private
// import week4.extra.packageKeyword.accounts.SamePackageReader; // ❌ Not visible: class is package-private

public class OtherPackageReader {
    public static void main(String[] args) {
        // PackageData pd = new PackageData();   // ❌ Not visible: class is package-private
        // System.out.println(pd.balanceCents);  // ❌ Not visible: members are package-private
        System.out.println("From another package, package-private is hidden.");
    }
}
