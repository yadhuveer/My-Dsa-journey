class Node:

    next=None
    pre=None
    
    def __init__(self, value):
        self.value=value 
       
    

    def __init__(self, value, next=None):
        self.value=value
        self.next=next
        
    


class LL:

    def __init__(self):
        self.size=0
        self.head=None
        self.tail=None

    
    def insertAtBeginning(self, val):
        node =  Node(val,self.head)
        if self.head!=None:
            self.head.pre=node
        #node.next= self.head
        self.head = node

        if self.tail == None:
            self.tail=self.head

        self.size+=1
    
    def insertAtLast(self,val):
        
        if self.head == None:
            self.insertAtBeginning(val)

        else:
            node = Node(val)
            node.pre = self.tail
            self.tail.next = node 
            self.tail = node
            self.size+=1

    def deleteAtFirst(self):

        if self.head == None:
            print("Linked list is empty")
        else:
            self.head = self.head.next
            self.head.pre = None
            self.size-=1

        if self.head == None:
            self.tail==None


    def deleteAtLast(self):
        if not self.head==None:
            if self.size==1:
                self.deleteAtFirst()
            else:
                preNode = self.getPreNode()
                preNode.next = None
                self.tail.pre = None
                self.tail = preNode
                self.size-=1
        else:
            print("Linked list is empty")        
    
    
    def deleteElementAtIndex(self,pos):
        if not self.head==None:
            if pos==0:
                self.deleteAtFirst()
            elif pos == self.size-1:
                self.deleteAtLast()
            else:
                temp=self.head
                preNode = None
                for i in range(pos):
                    preNode=temp
                    temp = temp.next

                preNode.next = temp.next
                temp.next.pre = preNode
                temp.next=None
                temp.pre=None
                self.size-=1 
        else:
            print("Linked list is empty")
    
    def InserElementAtIndex(self,indx,val):
        if self.head==None or indx==0:
            self.insertAtBeginning()
        elif indx > self.size-1:
            print("Given index is out of range")

        else:
            temp= self.head
            preNode=None
            for i in range(indx):
                preNode=temp
                temp=temp.next
            node = Node(val)    
            preNode.next=node
            node.next=temp
            node.pre = preNode
            temp.pre = node
            self.size+=1
            



    def getPreNode(self):
        temp = self.head

         #for i in range(self.size-2):
            #tem =temp.next
        while temp.next.next!=None:
            temp=temp.next
             
        return temp
    
    def printElementFromBeginning(self):
         temp = self.head
         
         if self.head ==None:
            print("Linked list is empty")

         
         else:
             while temp!=None:
                 print(temp.value,end=" ")
                 temp=temp.next


    def printElementFromEnd(self):
        temp = self.tail
        while temp!= None:
            print(temp.value,end=" ")
            temp=temp.pre

    
    def reverseLL(self):
        temp = self.head

        firstNode= True
        while temp!=None:
            node =  Node(temp.value)
            if firstNode:
                node.next=None
                self.head=node
                firstNode= False
            else:
                node.next=self.head
                self.head=node
            
            temp=temp.next


    
    

    


ll1 = LL()
ll1.insertAtBeginning(1)
ll1.insertAtBeginning(2)
ll1.insertAtBeginning(3)
ll1.insertAtBeginning(4)
ll1.insertAtBeginning(5)
ll1.insertAtLast(6)

ll1.printElementFromBeginning()

ll1.deleteAtFirst()

print("")

ll1.printElementFromBeginning()
ll1.deleteAtLast()

print("")

ll1.printElementFromBeginning()
ll1.deleteElementAtIndex(2)

print("")

ll1.printElementFromBeginning()

ll1.InserElementAtIndex(2,5)

print("")

ll1.printElementFromBeginning()

ll1.InserElementAtIndex(1,7)
print("")

ll1.printElementFromBeginning()

#ll1.reverseLL()

print("")

ll1.printElementFromBeginning()

print("")

ll1.printElementFromEnd()


