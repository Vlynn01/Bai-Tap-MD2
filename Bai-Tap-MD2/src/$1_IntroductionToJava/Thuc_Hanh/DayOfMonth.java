package $1_IntroductionToJava.Thuc_Hanh;

import java.util.Scanner;

class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tháng nào bạn muốn đếm ngày?");
        //Chương trình cần biết người dùng muốn tìm số ngày của tháng mấy.
        int month = scanner.nextInt();

        String daysInMonth = switch (month) {
            case 2 -> "28 or 29";
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            default -> "";
        };

        if (!daysInMonth.equals("")) System.out.printf("Tháng '%d' có %s ngày!", month, daysInMonth);
        else System.out.print("Đầu vào không hợp lệ!");


    }
}
