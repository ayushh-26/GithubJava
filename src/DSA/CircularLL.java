package DSA;
//Ayush Sehrawat
//22CSU041

class CircularLL{
    int size;
    Node head;
    Node tail;
    CircularLL(){
        head = null;
        tail = null;
        size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        Node(){
            this.data = 0;
        }
    }
    public void insertFirst(int data){
        Node n1 =new Node(data);
        if(head==null){
            head = n1;
            tail = n1;
        }
        tail.next = n1;
        n1.next = head;
        head = n1;
        size++;
    }
    public void insertLast(int data){
        Node n1 = new Node(data);
        if(head==null){
            head = n1;
            tail = n1;
        }
        tail.next = n1;
        n1.next = head;
        tail = n1;
        size++;
    }
    public void insertAtindex(int data, int index){
        Node n1 = new Node(data);
        Node pointer = head;
        for(int i=0; i<index-1; i++){
            pointer = pointer.next;
        }
        n1.next = pointer.next;
        pointer.next = n1;
        size++;
    }
    public void DeleteFirst(){
        if(head == null){
            System.out.print("list empty");
        }
        tail.next = head.next;
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head==null){
            System.out.print("list empty");
        }
        Node pointer = head;
        while(pointer.next != tail){
            pointer = pointer.next;
        }
        /*
        pointer.next = head.next;
        head =head.next;

         */
        pointer.next = tail.next;
        tail = pointer;
    }
    public void DeleteAtindex(int index){
        Node p = head;
        for(int i=0; i<index-1; i++){
            p = p.next;
        }
        p.next = (p.next).next;
        size--;
    }
    public void printlist(){
        Node p = head;
        if(head != null){
            do{
                System.out.print(p.data);
                System.out.print("-->");
                p = p.next;
            }while(p != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL list1 = new CircularLL();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);
        list1.printlist();
        list1.insertAtindex(22,2);
        list1.printlist();
        list1.DeleteFirst();
        list1.printlist();
        System.out.println("delete");
        list1.DeleteAtindex(1);
        list1.printlist();
        list1.insertLast(99);
        list1.printlist();
        list1.deleteLast();
        list1.printlist();
    }
}