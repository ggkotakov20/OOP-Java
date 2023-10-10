public class Main {
    public static void main(String[] args) {

        System.out.println("First task");
        System.out.println("Hello Java!");
        System.out.println("This is another line");

        System.out.println("Second task");
        for (int i=0;i<5;i++){
            System.out.println(i+1);
        }

        System.out.println("Third task");
        for (int i=0;i<5;i++){
            System.out.print(i+1+" ");
        }

        System.out.println();
        System.out.println("Last task");
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}