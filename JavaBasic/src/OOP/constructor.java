package OOP;

public class constructor {

    public static void main(String[] args){


        Student student1 = new Student();

        Student student2 = new Student("Madhu", 180, 150);

        Student student3 = student2;

        Student student4 = new Student(student2);

     System.out.println(student3.Name);
    }
}

class Student{

    int rollNo;
     String Name;
     int marks;

     public Student(){

         this.Name="yadhu";
         this.rollNo =179;
         this.marks= 100;

     }

     public Student(String Name , int rollNo, int marks ){

         this.Name=Name;
         this.rollNo=rollNo;
         this.marks=marks;

     }

     Student( Student other){
         this.Name= other.Name;
         this.rollNo=other.rollNo;
         this.marks=other.marks;
     }

      void outName(){
         System.out.println("My name is "+this.Name);
     }
}




