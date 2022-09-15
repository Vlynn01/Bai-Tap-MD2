package $2_VongLapTrongJava.Thuc_Hanh;

import java.util.Scanner;

public class UngDungChoVayTienLai {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);

        //Nhập giá trị cho các biến
        System.out.println("Nhập số tiền gửi: ");
        money = input.nextDouble();
        //Nhập số tháng gửi
        System.out.println("Nhập số tháng gửi: ");
        month = input.nextInt();
        //Nhập lãi suất
        System.out.println("Nhập lãi suất");
        interestRate = input.nextDouble();

        //Tính lãi suất nhận được
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;

            //In ra lãi suất
            System.out.println("Lãi suất: " + totalInterest);
        }
    }
}
