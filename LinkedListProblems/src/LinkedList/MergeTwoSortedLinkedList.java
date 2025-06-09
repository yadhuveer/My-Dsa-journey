package LinkedList;

public class MergeTwoSortedLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { // ListNode is pregiven
        ListNode head=null;
        ListNode pointer=null;
        ListNode head1 = list1;
        ListNode head2 = list2;
        if(list1==null && list2==null){
            return null;
        }

        if(list1==null && list2!=null){
            return list2;
        }

        if(list1!=null && list2==null){
            return list1;
        }

        while(head1!=null && head2!=null) {

            if(head1!=null && head1.val<=head2.val){
                ListNode node = new ListNode(head1.val);
                if(head==null){
                    head=node;
                    pointer=node;
                    head1=head1.next;
                }
                else{
                    pointer.next=node;
                    pointer = node;
                    head1=head1.next;
                }
            }
            else{
                ListNode node = new ListNode(head2.val);
                if(head==null){
                    head=node;
                    pointer=node;
                    head2=head2.next;
                }
                else{
                    pointer.next=node;
                    pointer=node;
                    head2=head2.next;
                }
            }


        }

        if(head2==null){
            while(head1!=null){
                ListNode node = new ListNode(head1.val);
                if(head==null){
                    head=node;
                    pointer=node;
                    head1=head1.next;
                }
                else{
                    pointer.next=node;
                    pointer=node;
                    head1=head1.next;
                }
            }
        }
        else{
            while(head2!=null){
                ListNode node = new ListNode(head2.val);
                if(head==null){
                    head=node;
                    pointer=node;
                    head2=head2.next;
                }
                else{
                    pointer.next=node;
                    pointer=node;
                    head2=head2.next;
                }
            }

        }
        return head;
    }

}
