package $3_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Arrays;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, -4, 22, 63, -42};
        int index = 2;
        int value = 10;
        int[] newArr = new int[arr.length + 1]; // tạo 1 mảng mới có độ dài lớn hơn mảng cũ 1 đơn vị
        int j = 0;  // đánh dấu số lượng phần tử trong mảng newArr
        for (int i = 0; i < arr.length; i++) {
            if (i == index) { // nếu i == index thì thêm phần tử vào vị trí index
                newArr[index] = value;
                j++; // tăng giá trị của j lên
            }
            // luôn cho các phần từ của mảng cũ sang mảng mới
            newArr[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
