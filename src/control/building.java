package control;

public abstract class building {

    final String name;
    int age;
    String street;
    String city;

    building(String name, int age, String street, String city) {
        this.name = "Магазин";
        this.age = age; this.street = street;
        this.city = city;
    }

    abstract void display();

    abstract void check_year_to_repair();
}
