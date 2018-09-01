package Stack;

public class Stack {

    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack();

        stack.push("Dhaka");
        stack.push("Khulna");
        stack.push("Chittagong");
        stack.push("Pabna");
// process is last in first out

        if(stack.peek().equalsIgnoreCase("Khulna")) {
            System.out.println(stack.pop());
        }

        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}

