package twelfthDecember;

public class Dog extends Mammal{
    protected void bark(){
        System.out.println("Dog is bark");
    }

    @Override
    public void eat(String food) {
        System.out.println("Eeating " + food);
    }

    @Override
    public void walk() {
        System.out.println("walking...");
    }
}
