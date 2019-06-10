package stacksandqueues;

public class Stack {

    Node top;

    // push onto a stack
    public void add(int data){
        Node newNode = new Node(data);
        if(this.top == null){
            top = newNode;
        }else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    // pop off a stack
    int remove() {
        int data = 0;
        try {
            data = this.top.data;
            this.top = this.top.next;
        } catch(NullPointerException e) {

        }
        return data;
    }

    // peek the top node
    public int peekTopOfStack(){
        int data = 0;
        try {
            data =  this.top.data;
        } catch(NullPointerException e){

        }
        return data;
    }

    // Checks to see if the Stack is empty
    public boolean isEmpty(){
        if(this.top == null){
            return true;
        }
        return false;
    }

    // stack size
    public int sizeOfStack(){
        return 0;
    }
}