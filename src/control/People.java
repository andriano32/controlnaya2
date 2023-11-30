package control;

public abstract class People {

    String name;
    int age;
    int height;
    int weight;

    People(String name, int age, int height, int weight) {
        this.name = name; this.age = age;
        this.height = height; this.weight = weight;
    }

    abstract void display();
    abstract void check_info_workers();

}
