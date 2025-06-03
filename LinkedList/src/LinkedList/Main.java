package LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList LL1 = new LinkedList();
        LL1.addElementAtFirst(1);
        LL1.addElementAtFirst(2);
        LL1.addElementAtFirst(3);
        LL1.addElementAtFirst(4);
        LL1.addElementAtFirst(5);
        LL1.addElementAtLast(6);
        LL1.printElementFromFirst();
        System.out.println();
        //System.out.println(LL1.size);
        LL1.deleteAtFirst();
        LL1.deleteAtLast();
        LL1.printElementFromFirst();
        LL1.deleteAtIndex(2);
        System.out.println();
        LL1.printElementFromFirst();
        LL1.deleteAtIndex(2);
        System.out.println();
        LL1.printElementFromFirst();
        System.out.println();
        LL1.InsertElementAtIndex(1,6);
        LL1.printElementFromFirst();
        LL1.InsertElementAtIndex(3,7);
        System.out.println();
        LL1.printElementFromFirst();

        LL1.reverseLL();
        System.out.println();
        LL1.printElementFromFirst();




    }
}
