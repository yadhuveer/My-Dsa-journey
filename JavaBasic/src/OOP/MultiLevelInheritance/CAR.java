package OOP.MultiLevelInheritance;

public class CAR {
    int speed;
    public CAR (){
        System.out.println("This is a car");
    }
    public CAR(CAR other){
        this.speed = other.speed;
        System.out.println(other.speed);
    }

    public CAR(int speed){
        this.speed=speed;
        System.out.println("The speed of normal car is "+this.speed);
    }

    public void simpleCar(){
        System.out.println("This is simple car");
    }

    public void normalCar(){
        System.out.println("This is normal car");
    }
}
