package LinkedList;

public class Cycle_Length {
    public  int getLength(ListNode head){ //ListNode is preGiven

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(fastPointer == slowPointer){
                ListNode temp = fastPointer;
                int length=0;
                do{
                    temp=temp.next;
                    length++;

                }while(fastPointer!=temp);
                return length;
            }
        }
        return 0;
    }
}
