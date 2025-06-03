package InterfaceProper;

public class Main {

    public static void main(String[] args){
        CarEngine car = new CarEngine();
        carMedia media = new carMedia();
        newCar newcar = new newCar(car);
        newCar newcar2 = new newCar(media);
        newcar.start();
        newcar2.start();

    }
}
