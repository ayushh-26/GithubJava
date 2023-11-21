package DSA;

class doublyLinkedList{
    // Ayush Sehrawat 22csu041
    int size;
    doublyLinkedList(){
        size = 0;
        head = null;
    }
    Node head;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        Node(){
            this.data = 0;
            this.next = null;
            this.previous = null;
        }

    }
    public void InsertAtFirst(int data){
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
        n1.previous = null;
        size++ ;
    }
    public void InsertAtLast(int data){
        Node n1 = new Node(data);
        Node Pointer = head;
        while(Pointer.next != null){
            Pointer = Pointer.next;
        }
        Pointer.next = n1;
        n1.previous = Pointer;
        n1.next = null;
        size++ ;
    }
    public void insertAtIndex(int data, int index){
        Node n1 = new Node(data);
        Node Pointer = head;
        for(int i=0; i<index-1; i++){
            Pointer = Pointer.next;
        }
        n1.previous = Pointer;
        n1.next = Pointer.next;
        Pointer.next = n1;
        size++;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.print("List empty");
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list already empty");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node SecondLastNode = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            LastNode = LastNode.next;
            SecondLastNode = SecondLastNode.next;
        }
        SecondLastNode.next = null;
        size-- ;
    }
    public void deleteAtIndex(int index){
        Node secondlast = head;
        Node last = head.next;
        for(int i=0; i<index-1; i++){
            last = last.next;
            secondlast = secondlast.next;
        }
        (last.next).previous = secondlast;
        secondlast.next = last.next;
        size--;

    }
    public void printList() {
        Node current = head;
        System.out.print("Null <-> ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        doublyLinkedList list1 = new doublyLinkedList();
        list1.InsertAtFirst(9);
        list1.InsertAtLast(8);
        list1.InsertAtLast(5);
        list1.InsertAtLast(2);
        list1.InsertAtLast(4);
        list1.printList();
        list1.insertAtIndex(6,3);
        list1.printList();
        list1.deleteAtIndex(3);
        list1.printList();
        list1.deleteFirst();
        list1.printList();
        list1.deleteLast();
        list1.printList();
    }
}