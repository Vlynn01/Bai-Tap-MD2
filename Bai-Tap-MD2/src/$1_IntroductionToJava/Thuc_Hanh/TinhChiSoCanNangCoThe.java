package $1_IntroductionToJava.Thuc_Hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        //Khai báo các biến sử dụng
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        //Nhập dữ liệu từ bàn phím.
        System.out.println("Cân nặng của bạn (tính bằng kg):");
        weight = scanner.nextDouble();

        System.out.println("Chiều cao của bạn (tính bằng mét):");
        height = scanner.nextDouble();
        //Tính chỉ số BMI theo công thức
        bmi = weight / Math.pow(height, 2); //Sử dụng hàm Math.pow(x,2) để bình phương của một số.

        //Hiển thị chỉ số và phân loại kết quả.
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
