package hashtable;

public class RepeatWord {

    public static String[] splitTheWords(String words){
        return words.replaceAll("[!,.]", "").toLowerCase().split(" ");
    }

    public static String addWordsToHash(String[] words){
        Hashtable ht = new Hashtable(words.length * 2);
        for(int i = 0; i < words.length; i++){
            int tempHash = ht.hash(words[i]);
            ht.set(words[i], words[i]);
            if(ht.map[tempHash].next != null) {
                if(ht.map[tempHash].value.equals(ht.map[tempHash].next.value)) {
                    return words[i];
                }
            }

        }
        return null;
    }
}