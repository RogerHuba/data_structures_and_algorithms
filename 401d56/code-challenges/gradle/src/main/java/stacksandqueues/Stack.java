package stacksandqueues;

public class Stack<T> {

    Node<T> front;

    // push onto a stack
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(this.front == null){
            front = newNode;
        }else {
            newNode.next = this.front;
            this.front = newNode;
        }
    }

    // pop off a stack
    T remove() {
        T data = null;
        try {
            data = this.front.data;
            this.front = this.front.next;
        } catch(NullPointerException e) {

        }
        return data;
    }

    // peek the top node`
    T peekTopOfStack(){
        T data = null;
        try {
            data =  this.front.data;
        } catch(NullPointerException e){

        }
        return data;
    }

    // Checks to see if the Stack is empty
    boolean isEmpty(){
        if(this.front == null){
            return true;
        }
        return false;
    }

    // stack size
    public int sizeOfStack(){
        return 0;
    }
}