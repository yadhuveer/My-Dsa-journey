package Pattern_Problems;

public class pattern1 {

    public void pattern(int columnMaintainer, int rowMaintainer){
        if(rowMaintainer==0){
            return;
        }

        if(columnMaintainer>0){
            //System.out.print("* ");
            pattern(columnMaintainer-1,rowMaintainer);
            System.out.print("* ");

        }
        else{
            //System.out.println("");
            rowMaintainer=rowMaintainer-1;
            columnMaintainer=rowMaintainer;
            pattern(columnMaintainer,rowMaintainer);
            System.out.println("");

        }


    }
}
