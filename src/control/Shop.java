package control;
import interfaces.Info_workers;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop extends building implements Info_workers {

    String name_shop; //Название магазина
    int count_workers; //Количество работников
    ArrayList<String> product = new ArrayList<>(); // Список продуктов в магазине


    ArrayList<String> conslut = new ArrayList<>();
    ArrayList<String> voditel = new ArrayList<>();
    ArrayList<String> prodaves = new ArrayList<>();
    ArrayList<String> manager = new ArrayList<>();
    ArrayList<String> gruschik = new ArrayList<>();
    ArrayList<String> yborshik = new ArrayList<>();


    //Конструктор//

    Shop(String name_shop, int count_workers, ArrayList<String> product, String name, String street, String city, int age) {
        super(name, age, street, city);
        this.age = age; this.street = street; this.city = city;

        this.name_shop = name_shop;
        this.count_workers = count_workers;
        this.product = product;

    }

    Shop(String name_shop, int count_workers, String name, String street, String city, int age) {
        super(name, age, street, city);
        this.age = age; this.street = street; this.city = city;

        this.name_shop = name_shop;
        this.count_workers = count_workers;
    }

    Shop(String name_shop, String name, String street, String city, int age) {
        super(name, age, street, city);
        this.age = age; this.street = street; this.city = city;

        this.name_shop = name_shop;
    }

    void display() {
        System.out.println("Название магазина: " + this.name_shop);
        System.out.println("Количество сотрудников: " + this.count_workers);
        System.out.println("Количество продуктов хранящихся в магазине: " + this.product.toString());
    }
    void check_year_to_repair() {
        if (this.age >= 60) {
            System.out.println("Необходим ремонт здания");
        }
        else {
            System.out.println("Ремонт ещё не скоро");
        }
    }



    //Инкапсуляция//

    void setName_shop(String nameShop) {
        this.name_shop = nameShop;
    }

    String getName_shop() {return this.name_shop;}

    void setCount_workers(int count_workers) {this.count_workers = count_workers;}

    int getCount_workers() {return this.count_workers;}

    void setProduct(String product) {
        this.product.add(product);
    }

    String getProduct(String product) {
        String result = this.product.get(this.product.indexOf(product));
        return result;
    }


    //Инкапсуляций абстрактных полей из класса building//

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {return this.age;}

    void setStreet(String street) {this.street = street;}


    String getStreet() {return this.street;}

    void setCity(String city) {this.city = city;}

    String getCity() {return this.city;}

    //Работа с сотрудниками//

    void addSotryd(String name, String post) {
        ArrayList<String> Ar_posts = new ArrayList<>(Arrays.asList("Продавец", "Консультант", "Водитель", "Директор", "Менеджер", "Грузчик", "Уборщик", "Уборщица"));
        if (Ar_posts.contains(post)) {
            if (post.equals("Водитель")) {
                this.voditel.add(name);
            }
            if (post.equals("Менеджер")) {
                this.manager.add(name);
            }
            if (post.equals("Продавец")) {
                this.prodaves.add(name);
            }
            if (post.equals("Консультант")) {
                this.conslut.add(name);
            }
            if (post.equals("Грузчик")) {
                this.gruschik.add(name);
            }
            if (post.equals("Уборщик") || post.equals("Уборщица")) {
                this.yborshik.add(name);
            }
        }
        else {
            System.out.println("нет ni!");
        }
    }

    int getSotryds(String post) {
        return (this.voditel.size() + this.conslut.size() + this.manager.size() + this.prodaves.size() + this.gruschik.size() + this.yborshik.size());
    }

    @Override
    public String name_workers_manager() {
        return this.manager.toString();
    }

    @Override
    public String name_workers_prodaves() {
        return this.prodaves.toString();
    }

    @Override
    public String name_workers_consult() {
        return this.conslut.toString();
    }

    @Override
    public String name_workers_voditel() {
        return this.voditel.toString();
    }

    @Override
    public String name_workers_yborshik() {
        return this.yborshik.toString();
    }

    void info_products(int count_p, String name) {
        System.out.println("Продукты, которые ждут своих покупателей в размере: " + count_p);
        System.out.println("Название продукта: " + name);
    }

    void list_neg_tovars(ArrayList<String> lst) {
        System.out.println("Список негодных товаров: " + lst.toString());
    }
}
