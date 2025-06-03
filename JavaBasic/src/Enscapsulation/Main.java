package Enscapsulation;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setter("yadhu");
        System.out.println(car.getter());
    }
}

 class Car{
    private String name;



    public void setter(String name){
        this.name=name;
    }

    public String getter(){
        return this.name;
    }
}
