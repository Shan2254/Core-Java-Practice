package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSquareExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.add(8);
//        list.add(10);

        Stream<Integer> stream = list.stream();
        List<Integer> square = stream.filter(i->i%2==0).map(i->i*i).collect(Collectors.toList());
        System.out.println(square);
    }
}
