package hashtable;

import tree.Tree;
import java.util.ArrayList;

public class TreeIntersection {

    public static ArrayList<Integer> getIntersectingTreeValues(Tree bt1, Tree bt2){
        Hashtable ht = new Hashtable(1024);
        ArrayList<Integer> newArr = new ArrayList<>(0);
        Tree.Node current1 = bt1.root;
        addBT(current1, newArr, ht);
        Tree.Node current2 = bt2.root;
        addBT(current2, newArr, ht);
        return newArr;
    }

    private static ArrayList addBT(Tree.Node current, ArrayList newArray, Hashtable ht) {
        if (current != null) {
            String leftValue = String.valueOf(current.left.data);
            ht.set(leftValue, leftValue);
            addBT(current.left, newArray, ht);
            String rightValue = String.valueOf(current.right.data);
            ht.set(rightValue, rightValue);
            addBT(current.right, newArray, ht);
        }
        return newArray;
    }
}
