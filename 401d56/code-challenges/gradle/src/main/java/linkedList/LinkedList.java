package linkedList;

public class LinkedList
{
    Node head;

    static class Node {
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Inserts a new value to the end of a list.
    public void insertValue(int value){
        Node currentNewNode = new Node(value);
        currentNewNode.next = null;

        if(this.head == null){
            this.head = currentNewNode;
        } else {
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = currentNewNode;
        }
    }

    //Insert a value to the end of the LinkedList (new Head)
    public void append(int value){
        Node currentNewNode = new Node(value);
        currentNewNode.next = null;
        if(this.head == null){
            this.head = currentNewNode;
        }else {
            currentNewNode.next = this.head;
            this.head.next = currentNewNode;
            this.head = currentNewNode;
        }
    }

    public boolean includesValue(int value){
        Node current = this.head;
        while(current != null){
            if(current.data == value){
                return true;
            } else{
                current = current.next;
            }
        }
        return false;
    }

    // Insert a new node before the value provided.
    public void insertBefore(int insertValue, int pivotValue){
        Node currentNewNode = new Node(insertValue);
        Node current = this.head;
        if(includesValue(pivotValue)) {
            while (current != null) {
                if (this.head.data == pivotValue) {
                    append(insertValue);
                    break;
                } else if (current.next.data == pivotValue) {
                    currentNewNode.next = current.next;
                    current.next = currentNewNode;
                    break;
                }
                current = current.next;
            }
        } else {
            throw new IllegalStateException("InListVal is not in Linked List");
        }
    }

    //Insert a new node after the value provided
    public void insertAfter(int insertValue, int pivotValue){
        Node currentNewNode = new Node(insertValue);
        Node current = this.head;
        if(includesValue(pivotValue)) {
            while (current != null) {
                if (current.data == pivotValue) {
                    if (current.next == null) {
                        currentNewNode.next = null;
                    } else {
                        currentNewNode.next = current.next;
                    }
                    current.next = currentNewNode;
                }
                current = current.next;
            }
        }else {
            throw new IllegalStateException("InListVal is not in Linked List");
        }
    }


    public String printLinkedList(){
        Node current = this.head;
        String ll = "LinkedList: ";
        while(current != null){
            if(current.next == null){
                ll = ll + current.data;
            } else {
                ll = ll + current.data + "->";
            }
            current = current.next;
        }
        return ll;
    }

    public int kthFromEnd(int k){
        int size = sizeOfLinkedList();
        int counter = size - k;
        if(counter > 0 & k >= 0) {
            Node current = this.head;
            while (counter > 1) {
                current = current.next;
                counter--;
            }
            return current.data;
        }else {
            throw new IllegalStateException("InListVal is not in Linked List");
        }
    }

    public int sizeOfLinkedList(){
        Node current = this.head;
        int listCounter = 0;
        while(current != null){
            listCounter++;
            current = current.next;
        }
        return listCounter;
    }
}