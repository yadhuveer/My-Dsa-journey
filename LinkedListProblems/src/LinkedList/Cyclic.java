package LinkedList;

public class Cyclic {
    public boolean hasCycle(ListNode head) { //ListNode is pregiven
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer =fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }

        return false;

    }
}
