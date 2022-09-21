package $11_DSA_Stack_Queue.ThucHanh.TrienKhaiStackSuDungLopLinkedListTrongThuVien_Java_Util;

public class GenericStackClient {

    public static void main(String[] args) {
        System.out.println("1. Stack of Strings");
        stackOfStrings();
        System.out.println("\n2. Stack of integers");
        stackOfIntegers();

    }

    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push(" Năm");
        stack.push(" Bốn");
        stack.push(" Ba");
        stack.push(" Hai");
        stack.push(" Một");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.print("1.2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.print("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

}
