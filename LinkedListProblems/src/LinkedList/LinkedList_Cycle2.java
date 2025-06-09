package LinkedList;

public class LinkedList_Cycle2 {
    public ListNode detectCycle(ListNode head) { // ListNode will be pre given

        int cycleLength = getLength(head);
        //System.out.println(Integer.toString(cycleLength));

        if(cycleLength==0){
            return null;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        for(int i=0; i < cycleLength; i++){
            slowPointer= slowPointer.next;
        }

        while(slowPointer!=fastPointer){
            slowPointer= slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return slowPointer;

    }
    public  int getLength(ListNode head){

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
