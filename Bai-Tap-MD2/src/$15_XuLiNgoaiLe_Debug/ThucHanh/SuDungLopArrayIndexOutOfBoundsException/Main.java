package $15_XuLiNgoaiLe_Debug.ThucHanh.SuDungLopArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array = arrayExample.createRandom();
        Scanner sc;
        int inputNumber;
        try {
            sc = new Scanner(System.in);
            System.out.println("\nEnter a index: ");
            inputNumber = sc.nextInt();
            System.out.println("Value of index[" + inputNumber + "] is: " + array[inputNumber]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index out of bounds!");
        }
    }
}