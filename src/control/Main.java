package control;
public class Main {
    public static void main(String[] args) {
        Shop new_shop = new Shop("RG - 'Ryan Gosling'", 12, "ТЦ", "Макса Горького 34", "Ростов-на-Дону", 45);
        new_shop.check_year_to_repair();
        new_shop.display();
        System.out.println(new_shop.getName_shop());
        new_shop.addSotryd("Слава", "Кассир");
        new_shop.addSotryd("Андрей", "Уборщик");
        new_shop.display();
        new_shop.addSotryd("Серафим", "Консультант");
        new_shop.addSotryd("Дениска", "Консультант");
        System.out.println(new_shop.name_workers_consult());
        new_shop.addSotryd("Виталий", "Водитель");
        System.out.println(new_shop.name_workers_voditel());
        System.out.println(new_shop.name_workers_yborshik());

        System.out.println("\n\n\n");
        Workers new_worker = new Workers("Директор", 12, "Геннадий", 55, 175, 90);
        new_worker.check_info_workers();
        new_worker.display();
        System.out.println(new_worker.getPost());
        new_worker.setAge(95);
        new_worker.setPost("Продавец");
        new_worker.check_info_workers();
        new_worker.display();

        System.out.println("\n\n\n");

        Product new_product = new Product("5", "Джем", "Ростов-на-Дону", "Стачки 23", 253232443, 99);
        new_product.display();
        new_product.qcode();
        new_product.setDay(26);
        new_product.setDescription("Джем Американский!");
        new_product.setYear_g(2023);
        new_product.setMonth_g(11);
        new_product.setCount_product(30);
        System.out.println(new_product.getDescription());
        new_product.info_god_product();
        new_product.display();
        System.out.println(new_product.count_product_to_buy());
    }
}