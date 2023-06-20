package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleEven {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);

        Stream<Integer> stream = list.stream();
        List<Integer> evenlist = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even numbers from the list are: "+evenlist);
    }
}
