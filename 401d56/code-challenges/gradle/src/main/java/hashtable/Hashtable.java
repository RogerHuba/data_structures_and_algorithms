package hashtable;

public class Hashtable {

    private Node[] map;

    public Hashtable(int size){
        map = new Node[size];
    }

    int hash(String key){
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for(int i = 0; i < letters.length; i++){
            hashValue += letters[i];
        }
        hashValue = (hashValue * 843) % map.length;
        return hashValue;
    }

    public void set(String key, String value) {
        int hashkey = hash(key);

        if (this.map[hashkey] == null) {
            map[hashkey] = new Node(key, value);
        } else {
            Node temp = map[hashkey];
            map[hashkey] = new Node(key, value);
            map[hashkey].setNext(temp);
        }
    }

    // get
    public String get(String key){
        int hashkey = hash(key);
        String value = map[hashkey].getValue();

        return value;
    }

    // getLength
    public int getLength(){
        int value = map.length;
        return value;
    }

    // contains
    public Boolean contains(String key){
        int hashkey = hash(key);
        if(map[hashkey] != null) {
            return true;
        } else {
            return null;
        }
    }
}