package lambda;

import java.util.ArrayList;

public class duplicate {

    public static void main(String[] args) {
        duplicate obj = new duplicate();
        List<String> array = new ArrayList<>();
        array.add("A");
        array.add("B");
        array.add("A");
        array.add("C");

        array.stream().filter(i -> Collections.frequency(array, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
