package stacksandqueues;

public class Stack {

    Node front;

    // push onto a stack
    public void add(int data){
        Node newNode = new Node(data);
        if(this.front == null){
            front = newNode;
        }else {
            newNode.next = this.front;
            this.front = newNode;
        }
    }

    // pop off a stack
    int remove() {
        int data = 0;
        try {
            data = this.front.data;
            this.front = this.front.next;
        } catch(NullPointerException e) {

        }
        return data;
    }

    // peek the top node
    public int peekTopOfStack(){
        int data = 0;
        try {
            data =  this.front.data;
        } catch(NullPointerException e){

        }
        return data;
    }

    // Checks to see if the Stack is empty
    public boolean isEmpty(){
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