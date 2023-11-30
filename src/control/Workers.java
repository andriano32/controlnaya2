package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Workers extends People{

    String post;
    int year_to_work;

    ArrayList<String> Ar_posts = new ArrayList<>(Arrays.asList("Продавец", "Консультант", "Водитель", "Директор", "Менеджер", "Грузчик", "Уборщик", "Уборщица"));


    Workers(String post, int year_to_work, String name, int age, int height, int weight) {
        super(name, age, height, weight);

        this.post = post;
        this.year_to_work = year_to_work;

        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    //Инкапсуляция///

    void setPost(String post) {
        if (Ar_posts.contains(post)) {
            this.post = post;
        }
        else {
            System.out.println("Нет такой должности!");
        }
    }

    void setYear_to_work(int year_to_work) {
        this.year_to_work = year_to_work;
    }

    int getYear_to_work() {return this.year_to_work;}

    //Инкапсуляция атрибутов класса People//

    void setName(String name ) {
        String name_now = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.name = name_now;
    }

    String getName() {return this.name;}

    void setAge(int age) {
        if (age >= 70) {
            System.out.println("Отказано, данный человек слишком стар.");
        }
        else {
            this.age = age;
        }
    }

    int getAge() {return this.age;}

    void setHeight(int height) {
        if (height >= 200 || height <= 140) {
            System.out.println("Отказано, рост не подходит.");
        }
        else {
            this.height = height;
        }
    }

    int getHeight() {return this.height;}

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return this.weight;
    }

    String getPost() {
        return this.post;
    }

    //Переопределение методов//
    @Override
    void display() {
        System.out.println("Имя: " + this.name);
        System.out.println("Лет: " + this.age);
        System.out.println("Рост: " + this.height);
        System.out.println("Вес: " + this.weight);
    }

    @Override
    void check_info_workers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Должность сотрудника: " + this.post);
        System.out.println("Количество отработанных лет: " + this.year_to_work);

        if (this.year_to_work >= 4 && (this.post.equals("продавец"))) {
            System.out.println("Сотрудника пора повысить.\nЖелаете дать повышение " + this.name + " ? (Y/N): ");
            String choice = sc.nextLine();
            if (choice.equals("Y")) {
                this.name = "Менеджер";
                System.out.println("Повышение активно!");
            }
            else {
                System.out.println("Вы отказали в повышении..");
            }
        }
        else {
            System.out.println("Работай дальше.");
        }

    }
}