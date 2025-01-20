import java.util.LinkedList;

public class LL { 
    Node head;
    private int size;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
        }
    }

    public void addFirst(String data){
        Node newNode = new  Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }


    public void addLast(String data){
        Node newNode = new  Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        
        size++;
        currentNode.next = newNode;
    }


    public void printList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> " );
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }

    public void emptyList(){
        head = null;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode  = lastNode.next;
            secondLastNode = secondLastNode.next;
        } 

        secondLastNode.next = null;
    }

    public  int getSize(){
        return size;
    }


    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("List");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
