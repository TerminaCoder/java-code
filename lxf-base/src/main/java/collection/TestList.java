package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestList {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");

        array.remove(1);
        array.forEach(System.out::println);
        //array.stream().forEach(System.out::println);

    }
}
