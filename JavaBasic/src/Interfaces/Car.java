package Interfaces;

public class Car implements Engine,Media{

    public void start(){
        System.out.println("The car engine is starting");
    }

    public void end(){
        System.out.println("The car engine is stopping");
    }
}

