package Pattern_Problems;

public class pattern1Way2 {
    public void pattern(int columnMaintainer, int rowMaintainer){

        if(rowMaintainer==0){
            return;
        }

        if(columnMaintainer<rowMaintainer){
            //System.out.print("* ");
            pattern(columnMaintainer+1,rowMaintainer);
        }
        else{
            System.out.println("");
            pattern(0,rowMaintainer-1);
            System.out.print("* ");
        }
    }
}
