package animal;

public class Dog extends Animal{
    public String breed;

    public Dog(String breed, int age){
        super(age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return this.breed + " " + super.age;
    }
}
