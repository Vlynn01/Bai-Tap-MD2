package $3_MangVaPhuongThucTrongJava.NangCao.ThucHanh;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        //Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("Nhập kích thước: ");
            size = scanner.nextInt();
            if(size>30)
                System.out.println("Kích thước không được vượt quá 30: ");
        }while (size>30);
        //Nhập giá trị cho các phần tử của mảng
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Nhập điểm cho học sinh: ");
            array[i] = scanner.nextInt();
            i++;
        }
        //Sử dụng vòng lặp for để in ra danh sách điểm vừa nhập, đồng thời đếm số lượng sinh viên thi đỗ
        int count =0;
        System.out.println("Danh sách nhãn hiệu: ");
        for (int k : array) {
            System.out.println(k + "\t");
            if (k >= 5 && k <= 10)
                count++;
        }
        System.out.println("\\ n Số học sinh vượt qua kỳ thi là" +count);
    }
}
