package $1_IntroductionToJava.Thuc_Hanh;

import java.util.Scanner;

class TinhNamNhuan {

    public static void main(String[] args) {
        //Khai báo các biến
        Scanner scanner = new Scanner(System.in);
        int year;
        //Nhập dữ liệu từ bàn phím
        System.out.println("Nhập số năm: ");
        year = scanner.nextInt();
        //Phân loại và hiển thị kết quả
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d Đây là năm nhuận", year);
        } else {
            System.out.printf("%d Đây không phải là năm nhuận", year);
        }
    }
}
