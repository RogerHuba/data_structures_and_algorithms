package stacksandqueues;

public class AnimalShelter<T> {
    Node<T> head;
    Node<T> tail;

    public void enQueue(T data){
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public T deQueue(){
        if (this.head == null) {
            throw new IllegalStateException("Cannot dequeue on an empty queue");
        } else {
            T value = this.head.data;
            this.head = this.head.next;
            if (this.head == null) {
                this.tail = null;
            }
            return value;
        }
    }

    public T peek(){
        T data;
        if (this.head == null){
            throw new IllegalStateException("Cannot peek at an empty Queue");
        } else {
            data = this.head.data;
        }
        return data;
    }
}
