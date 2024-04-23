package march.nineteenth;

public class Main {
    public static void main(String[] args) {
        MyCustomList<String> names = new MyCustomList<>();
        names.add("Ivan");
        names.add("Georgi");
        names.add("Stoyan1");
        names.add("Stoyan2");
        names.add("Stoyan3");
        names.add("Stoyan4");
        names.add("Stoyan5");

//        for (String name : names) {
//            System.out.println(name);
//        }

//        Iterator myIterator = names.iterator();
//        while (myIterator.hasNext()){
//            System.out.println(myIterator.next());
//        }

        names.forEach(e -> System.out.println(e));
    }
}
