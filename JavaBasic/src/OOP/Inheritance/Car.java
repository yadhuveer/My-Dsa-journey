package OOP.Inheritance;

public class Car {

    String Color;
    String  Speed;

    String place="Banglore";

    public Car(){
        System.out.println("This is car");
    }
    public Car( int cost, String brand){
        System.out.println("Cost is "+cost+ "brand is "+brand );
    }
}
