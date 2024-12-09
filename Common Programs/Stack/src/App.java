public class App {
    public static void main(String[] args) throws Exception {
        
        Stack<Integer> stack = new Stack<>();

        
        // Try to pop out something from Stack
        stack.pop();

        // Push something in the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.readAllTheStackValues();

        System.out.println("Pop stack: " + stack.pop());
        stack.readAllTheStackValues();
        System.out.println("Pop stack: " + stack.pop());
        stack.readAllTheStackValues();
        System.out.println("Pop stack: " + stack.pop());
        stack.readAllTheStackValues();

        
    }
}
