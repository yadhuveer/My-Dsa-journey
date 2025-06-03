package OOP.Inheritance;

 class BMW extends Car{

    public BMW(){
        System.out.println("This is a child car");
    }

    public BMW(int cost, String brand) {
        super(cost, brand);
    }



    public static void main(String[] args) {
       BMW bmw1 =new BMW(10000,"BMW");
       System.out.println(bmw1.place);
   }
}

