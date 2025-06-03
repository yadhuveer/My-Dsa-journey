package OOP.RuntimePolyMorphism;

public class BMW extends Car{

    public static void normalCar(){
        System.out.println("This is BMW");
    }

    public static void main(String[] args){
        BMW bmw = new BMW();
        bmw.normalCar();

    }
}
