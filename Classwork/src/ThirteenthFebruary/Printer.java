package ThirteenthFebruary;

import animal.Animal;

import java.io.Serializable;

public class Printer<T > {
    private T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}