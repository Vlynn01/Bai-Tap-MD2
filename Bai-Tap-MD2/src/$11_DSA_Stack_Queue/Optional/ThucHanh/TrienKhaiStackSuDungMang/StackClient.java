package $11_DSA_Stack_Queue.Optional.ThucHanh.TrienKhaiStackSuDungMang;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack= new MyStack(5);

        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        System.out.println("1. SIze of stack after push operations: "+myStack.size());
        System.out.print("2. Pop elements from stack: ");

        while (!myStack.isEmpty()){
            System.out.printf("%d", myStack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations: "+myStack.size());
    }
}
