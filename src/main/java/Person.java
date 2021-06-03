import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    // Constructors:
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    // Поведение параметров:
    // int
    public void happyBirthday() {
        this.age = age + 1;
    }

    public boolean hasAge() {
        return this.age == this.getAge();
    }

    // address
    public void setAddress(String city) {
        this.address = city;
    }

    public boolean hasAddress() {
        return this.address.equals(this.getAddress());
    }

    // System methods:
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    // Other:
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAddress(this.address).setSurname(this.surname).setAge(0);
    }
}
