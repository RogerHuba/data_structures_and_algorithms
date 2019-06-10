package stacksandqueues;

public class Queue {

    Node head; // Remove from the head
    Node tail;

    public void enQueue(int data){
        Node newNode = new Node(data);
        if(this.tail != null){
            this.tail.next = newNode;
        }
        this.tail = newNode;
        if(this.head == null){
            this.head = newNode;
        }
    }

    public int deQueue(){
        int data = this.head.data;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return data;
    }


    public int peekTopOfQueue(){
        if(this.head == null){
            System.out.println("Cannot Peek an empty Queue");
            // Need a real exception handler here
        }
        return this.head.data;
    }


    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    // stack size
    public int sizeOfQueue(){
        return 0;
    }


}

//
//    Create a Queue class that has a front property. It creates an empty Queue when instantiated.
//        This object should be aware of a default empty value assigned to front when the queue is created.
//        Define a method called enqueue which takes any value as an argument and adds a new node with that value to
//        the back of the queue with an O(1) Time performance.
//        Define a method called dequeue that does not take any argument, removes the node from the front of the queue,
//        and returns the node’s value.
//        Define a method called peek that does not take an argument and returns the value of the node located in the
//        front of the queue, without removing it from the queue.