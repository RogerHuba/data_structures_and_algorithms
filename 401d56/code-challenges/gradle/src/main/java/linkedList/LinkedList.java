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

    public static LinkedList insertValue(LinkedList list, int value){
        Node currentNewNode = new Node(value);
        currentNewNode.next = null;

        if(list.head == null){
            list.head = currentNewNode;
        } else {
            Node current = list.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = currentNewNode;
        }
        return list;
    }

    public static boolean includesValue(LinkedList list, int value){
        Node current = list.head;
        while(current != null){
            if(current.data == value){
                return true;
            } else{
                current = current.next;
            }
        }
        return false;
    }

    public static String printLinkedList(LinkedList list){
        Node current = list.head;
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

    public static int sizeOfLinkedList(LinkedList list){
        Node current = list.head;
        int listCounter = 0;
        while(current != null){
            listCounter++;
            current = current.next;
        }
        return listCounter;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        System.out.println(list.head);
        insertValue(list, 1);
        insertValue(list, 3);
        insertValue(list, 5);
        insertValue(list, 12);
        insertValue(list, 18);
        insertValue(list, 25);
        printLinkedList(list);

        System.out.println(includesValue(list, 1));
        System.out.println(includesValue(list, 7));
        System.out.println(includesValue(list, 18));
        System.out.println(sizeOfLinkedList(list));
    }
}
