package $3_MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước vào: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không được vượt quá 20");
        } while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        //Nhập giá trị cho các phần tử của mảng
        while (i < array.length) {
            System.out.println("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
        System.out.println("Danh sách tài sản: ");
        for (int k : array) {
            System.out.println(k + "\t");
        }
        //Duyệt các phần tử trong mảng để tìm Max và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là " + max + " ,ở vị trí " + index);
    }
}
