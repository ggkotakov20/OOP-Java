package oldCode.animal;

public class Dog extends Animal implements Comparable<Dog>{

    private String name;
    private String breed;

    public Dog(String name, String breed, int age) {
        super(age);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return this.breed + " " + super.age;
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public int compareTo(Dog other) {
        if(super.age == other.age){
            if(this.name.compareTo(other.name) == 0){
                return 0;
            } else if (this.name.compareTo(other.name) > 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.age > other.age){
            return 1;
        } else {
            return -1;
        }
    }
}
