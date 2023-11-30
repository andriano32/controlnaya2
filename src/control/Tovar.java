package control;

public abstract class Tovar {

    String name_tovar;
    String city;
    String street;
    int qcode;

    Tovar(String name_tovar, String city, String street, int qcode) {
        this.name_tovar = name_tovar; this.city = city; this.street = street;
        this.qcode = qcode;
    }

    abstract void display();

    abstract String qcode();
}
