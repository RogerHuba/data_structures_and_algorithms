package stacksandqueues;

import java.util.Stack;

public class Multibracketvalidation {
    public static boolean multibracketvalidation(String input){
        String[] inputArray = input.split("");
        Stack<String> newStack = new Stack<>();
        for(int i=0; i < inputArray.length; i++){
            if(inputArray[i].equals("[") || inputArray[i].equals("{") || inputArray[i].equals("(")){
                newStack.push(inputArray[i]);
            }
            else{
                if(inputArray[i].equals("}") && newStack.peek().equals("{")){
                        newStack.pop();
                }
                else if(inputArray[i].equals("]") && newStack.peek().equals("[")){
                    newStack.pop();
                }
                else if(inputArray[i].equals(")") && newStack.peek().equals("(")){
                    newStack.pop();
                }
            }
        }
        if(newStack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}