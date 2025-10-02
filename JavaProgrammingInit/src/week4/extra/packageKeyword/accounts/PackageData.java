package week4.extra.packageKeyword.accounts;

class PackageData {
    int balanceCents = 0;           // package-private field
    void deposit(int cents) {       // package-private method
        if (cents < 0) throw new IllegalArgumentException("neg deposit");
        balanceCents += cents;
    }
}
