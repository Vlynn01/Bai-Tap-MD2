package $1_IntroductionToJava.Thuc_Hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner

        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat(); //Nhập chiều cao
        float arena = width * height;
        System.out.println("Diện tích hình chữ nhật là: " + arena);
    }
}
