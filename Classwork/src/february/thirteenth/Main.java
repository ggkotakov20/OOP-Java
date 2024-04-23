package february.thirteenth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        printList(numbers);

        List<String> strings = new ArrayList<>();

        strings.add("saasd");
        strings.add("adafdg");
        strings.add("hjkhk");
        printList(strings);
    }

    public static <T> void printList(List<T> list){
        System.out.println(list);
    }

    public static <T, V> void shout(T thingToPrint, V secondThingToPrint){
        System.out.println(thingToPrint + " " + secondThingToPrint + " !!!!");
    }
}
