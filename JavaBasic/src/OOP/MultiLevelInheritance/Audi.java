package OOP.MultiLevelInheritance;

public class Audi extends BMW{

    public Audi(){

    }
    public Audi(Audi other){
        super(other);
        System.out.println(other.speed);
    }

    public  Audi(int speed){
        super(speed);
    }

    public static void main(String[] args){
        Audi audi = new Audi(10);
        audi.normalCar();
    }
}
