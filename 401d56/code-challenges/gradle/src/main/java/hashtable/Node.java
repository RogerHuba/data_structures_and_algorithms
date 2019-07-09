package hashtable;

public class Node {

    private String key;
    private String value;
    private Node next;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public void setNext(Node node) {
        this.next = node;
    }

    public void setKey(String key){
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void Node(String key, String value){
        setKey(key);
        setValue(value);
    }

    public Node(){}

    public Node getNext(){
        return next;
    }

    public String getKey(){
        return key;
    }

    public String getValue(){
        return this.value;
    }
}
