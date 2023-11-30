package control;
import interfaces.Info_Products;

import java.util.ArrayList;
import java.util.HashMap;

public class Product extends Tovar implements Info_Products {

    String name_product;
    int year_g;
    int month_g;
    int day;
    String description;
    int price;

    int count_product;


    //Товары, которые не годны.
    final static HashMap<Integer, String> qcode_tovar = new HashMap<>();
    final static ArrayList<String> tovars = new ArrayList<>();


    //Конструктор//

    Product(String name_product, int year_g, int month_g, int day, String description, String name_tovar, String city, String street, int qcode, int price) {
        super(name_tovar, city, street, qcode);


        this.name_product = name_product;
        this.year_g = year_g;
        this.month_g = month_g;
        this.day = day;
        this.description = description;

        this.name_tovar = name_tovar;
        this.city = city;
        this.street = street;
        this.qcode = qcode;
        this.price = price;

    }

    Product(String name_product, String name_tovar, String city, String street, int qcode, int price) {
        super(name_tovar, city, street, qcode);


        this.name_product = name_product;
        this.price = price;
        this.name_tovar = name_tovar;
        this.city = city;
        this.street = street;
        this.qcode = qcode;

    }


    //Инкапсуляция//

    void setName_product(String nameProduct) {this.name_product = nameProduct;}

    String getName_product() {return this.name_product;}

    void setMonth_g(int month_g) {this.month_g = month_g;}

    int getMonth_g() {return this.month_g;}

    void setYear_g(int yearG) {this.year_g = yearG;}

    int getYear_g() {return this.year_g;}

    void setDay(int day) {this.day = day;}

    int getDay() {return this.day;}

    void setDescription(String description) {
        this.description = description;
    }

    String getDescription() {return this.description;}

    void setCount_product(int count_product) {
        if (count_product <= 0) {
            System.out.println("Отказано.");
        }
        else {
            this.count_product = count_product;
        }
    }

    int getCount_product() {return this.count_product;}

    //Инкапсуляций методов класса Tovar//

    String get_NameTovar() {return this.name_tovar;}

    void set_NameTovar(String NameTovar) {this.name_tovar = NameTovar;}

    void setCity(String City) {
        this.city = City;
    }

    int getPrice() {
        return this.price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getCity() {return this.city;}

    void setStreet(String street) {
        this.street = street;
    }

    String getStreet() {
        return this.street;
    }

    void setqcode(int qcode) {
        this.qcode = qcode;
    }

    int getqcode() {return this.qcode;}


    void information() {
        System.out.println("Название продукта: " + this.name_product);
        System.out.println("Пригодность (год): " + this.year_g);
        System.out.println("Пригодность (месяц): " + this.month_g);
        System.out.println("Пригодность (день): " + this.day);
        System.out.println("Описание: " + this.description);
        System.out.println("Цена товара: " + this.price);
    }

    //Переопределение методов//

    @Override
    void display() {
        System.out.println("Название товара: " + this.name_tovar);
        System.out.println("Город: " + this.city);
        System.out.println("Улица: " + this.street);
        System.out.println("Код товара: " + this.qcode);
    }

    @Override
    String qcode() {
        if (qcode < 10000) {
            System.out.println("Товар негоден");
            qcode_tovar.put(this.qcode, this.name_tovar);
            tovars.add(this.name_product);
        }
        else {
            return "Товар годен";
        }
        return "Обработка прошла успешно";
    }

    @Override
    public void info_count_product() {
        if (this.count_product > 0) {
            System.out.println("Продукт: " + this.name_product + " имеется в магазине.");
        }
        else {
            System.out.println("Продукта нет.");
        }
    }

    @Override
    public void info_god_product() {
        if (this.year_g >= 2023) {
            if (this.month_g >= 10) {
                if (this.month_g > 10 && this.day > 25) {
                    System.out.println("Продукт " + this.name_product + " годен.");
                }
            }
        }
        else {
            System.out.println("Продукт не годен.");
            this.count_product = 0;
        }
    }

    @Override
    public int count_product_to_buy() {
        return this.count_product;
    }
}