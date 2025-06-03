package LinkedList;

public class LinkedList {

public Node head;
public Node tail;
public int size;

public LinkedList(){
    this.size=0;
}

public void addElementAtFirst(int value){

    Node node = new Node(value);
    node.next = head;
    head=node;

    if(tail==null){
        tail=head;
    }
    this.size+=1;
}

public void addElementAtLast(int value){
    if(tail==null){
        addElementAtFirst(value);
    }
    else {
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        this.size+=1;
    }



}

public void printElementFromFirst(){
    if(head==null){
        System.out.println("Linked list is empty");
    }
    else{
        Node temp = head;

        while(temp!=null){

            System.out.print(temp.value);
            temp = temp.next;

        }
    }
}

public void deleteAtFirst(){

    head= head.next;
    if(head.next==null){
        tail=null;

    }
    this.size--;
}

public void deleteAtLast(){

    if(this.size == 1){
        this.deleteAtFirst();
    }
    else {

        Node lastpreviousNode = getPreviousNode(this.size - 2);
        //System.out.println(lastpreviousNode.value);
        lastpreviousNode.next=null;
        tail=lastpreviousNode;
    }

    this.size--;


}

public void deleteAtIndex(int index){
    Node temp = head;
    Node preNode = null;
    if(index>(this.size-1)){
        System.out.println("Index out of range");
    }
    else{
        if( index == 0){
            this.deleteAtFirst();
        }
        else if(index== this.size-1){
            this.deleteAtLast();
        }
        else{

            for(int i=0; i<index; i++){
                preNode = temp;
                temp = temp.next;
            }

            preNode.next=temp.next;
            temp.next=null;

            this.size--;
        }


    }

}

public Node getPreviousNode(int size){
    Node temp = head;

    for(int i=0;i<size;i++){
        temp=temp.next;
    }

    return temp;
}

public void InsertElementAtIndex(int pos,int val){
    if(pos==0){

        this.addElementAtFirst(val);
    }
    else {
        Node temp = head;
        Node preNode= null;
        for(int i=0;i<pos;i++){

            preNode=temp;
            temp=temp.next;
        }

        Node node = new Node(val);
        preNode.next =node;
        node.next=temp;
        this.size++;
    }

}

public void reverseLL(){
    Node temp = head;

    boolean firstNode=true;

    while(temp!=null){
        Node node = new Node(temp.value);
        if(firstNode){
            node.next=null;
            head=node;
            firstNode=false;
        }
        else{
            node.next=head;
            head=node;
        }
        temp=temp.next;

    }
}


    public class Node{

        private int value;
        private Node next;

        public Node (int value){
            this.value=value;
        }

        public Node (int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
