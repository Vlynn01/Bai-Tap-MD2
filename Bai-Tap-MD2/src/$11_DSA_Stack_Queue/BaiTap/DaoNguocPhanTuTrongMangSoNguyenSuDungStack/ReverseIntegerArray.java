package $11_DSA_Stack_Queue.BaiTap.DaoNguocPhanTuTrongMangSoNguyenSuDungStack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{11, 22, 33, 44, 55};

        Stack<Integer> stack = new Stack<>();
        for (Integer integer : arrInt)
            stack.push(integer);

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]= stack.pop();
        }

        System.out.println(Arrays.toString(arrInt));

    }
}
