package week4.extra.composition.models;

// Employee has-a Name and has-an Address
public class Employee {
    private final Name name;         // composition
    private Address address;         // mutable part to show updates

    public Employee(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void moveTo(Address newAddress) { this.address = newAddress; }

    @Override public String toString() {
        return "Employee{name=" + name + ", address=" + address + "}";
    }
}
