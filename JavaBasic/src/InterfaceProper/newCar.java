package InterfaceProper;

public class newCar {

    Engine engine;

    public newCar(CarEngine other){
        this.engine=other;
    }

    public newCar(carMedia other){
        this.engine=other;
    }

    public void start(){
        this.engine.start();
    }
}
