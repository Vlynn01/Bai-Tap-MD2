package $3_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, -4, 22, 63, -42};
        int index = 2;
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) { // nếu i != index thì thêm phần tử vào mảng mới
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
