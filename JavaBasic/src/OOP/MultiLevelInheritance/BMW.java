package OOP.MultiLevelInheritance;

public class BMW extends CAR{


    public BMW(){

    }

    public BMW(int speed){
        super(speed);

    }

    public BMW(BMW other){
        super(other);
        System.out.println("BMW speed is "+other.speed);

    }


}
