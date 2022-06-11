package Stack_and_Queue;

public class stackMain {
    public static void main(String[] args) throws StackException {
        customStack stack = new DynamicStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(9);
        stack.push(7);
        stack.push(78);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());






    }
}
