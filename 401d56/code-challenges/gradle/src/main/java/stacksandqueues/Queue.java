package stacksandqueues;

public class Queue<T> {

    Node<T> head; // Remove from the head
    Node<T> tail;

    public void enQueue(T data){
        Node<T> newNode = new Node<>(data);
        if(this.tail != null){
            this.tail.next = newNode;
        }
        this.tail = newNode;
        if(this.head == null){
            this.head = newNode;
        }
    }

    public T deQueue(){
        T data = this.head.data;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return data;
    }

    public T peek(){
        if(this.head == null){
            throw new IllegalStateException("Cannot peek an empty Queue");
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