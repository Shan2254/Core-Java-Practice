package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Papaya");
        fruit.add("Pineapple");
        fruit.add("Guava");

        System.out.println(fruit);

        List<String> f= fruit.stream().filter(e->e.startsWith("P")).collect(Collectors.toList());
        System.out.println(f);
    }
}
