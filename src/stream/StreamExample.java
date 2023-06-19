package stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class StreamExample {
    public static void main(String[] args) {
        List<Product> productslist = new ArrayList<Product>();

        productslist.add(new Product(1,"HP Laptop",50000));
        productslist.add(new Product(2,"Dell Laptop",45000));
        productslist.add(new Product(3,"Lenovo Laptop",35000));
        productslist.add(new Product(4,"Apple Laptop",70000));
        productslist.add(new Product(5,"Asus Laptop",40000));
        List<Double>pl = productslist.stream().filter(p->p.price>40000).map(p->p.price).collect(Collectors.toList());
        System.out.println(pl);
    }

}
