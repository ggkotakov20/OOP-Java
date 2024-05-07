package may.seventh;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Function<String, Integer> parse = e -> Integer.parseInt(e);
//        Consumer<Integer> intPrinter = e -> System.out.println(e + " ");
//        Predicate<Integer> isOdd = e -> e % 2 != 0;
//
//        String[] input = scanner.nextLine().split(", ");
//        List<Integer> nums = Arrays.stream(input)
//                .map(parse)
//                .collect(Collectors.toList());
//
//        nums.removeIf(isOdd);
//        nums.forEach(e -> System.out.print(e + " "));
//        nums.sort((a,b) -> a.compareTo(b));
//        System.out.println();
//        nums.forEach(intPrinter);
//
//        Supplier<Integer> intGen = () -> new Random().nextInt(10);
//
//        System.out.println(intGen.get());

//        BiFunction<Integer, Double, String> sum = (a, b) -> "Sum is " + (a + b);
//
//        System.out.println(sum.apply(1, 8.0));

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine()
                .split(", ");

        int sum = Arrays.stream(input)
                    .mapToInt(e -> Integer.parseInt(e))
                    .sum();
        long count = Arrays.stream(input)
                        .count();

        Consumer<Integer> sumPrinter = e -> System.out.println("Sum = " + e);
        Consumer<Long> countPrinter = e -> System.out.println("Count = " + e);

        System.out.println("Sum: " + sum);
        sumPrinter.accept(sum);
        countPrinter.accept(count);
    }

}
