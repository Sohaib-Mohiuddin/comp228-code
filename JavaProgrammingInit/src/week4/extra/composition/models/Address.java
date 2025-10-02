package week4.extra.composition.models;

public class Address {
    private final String street, city, country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }
    @Override public String toString() { return street + ", " + city + ", " + country; }
}
