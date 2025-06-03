package InterfaceProper;

public class CarEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Car engine starts");
    }

    public void end(){
        System.out.println("Car engine ends");
    }
}
