package stacksandqueues;

public class AnimalShelter<T> {
    Node<T> head;
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

    public T deQueue(T data) {
        if (data != "dog" && data != "can") {
            return null;
        } else {
            T headData = this.head.data;
            this.head = this.head.next;
            if (this.head == null) {
                this.tail = null;
            }
            return headData;
        }
    }
}
