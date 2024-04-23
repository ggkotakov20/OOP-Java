package november.twentyFirst;

import november.fourteenth.Human;

public class Student extends Human {
    public Student(String name, int age) {
        super(name, age);
    }

    public void test(){
        super.name = "Petio";
    }
}
