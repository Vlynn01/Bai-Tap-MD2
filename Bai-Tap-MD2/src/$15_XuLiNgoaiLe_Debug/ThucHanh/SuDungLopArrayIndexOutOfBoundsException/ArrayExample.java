package $15_XuLiNgoaiLe_Debug.ThucHanh.SuDungLopArrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public int[] createRandom() {
        Random random = new Random();
        int[] array = new int[100];
        System.out.println("The element of the array: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}