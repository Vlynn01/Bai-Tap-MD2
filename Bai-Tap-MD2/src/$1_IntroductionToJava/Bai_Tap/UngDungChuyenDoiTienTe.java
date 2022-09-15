package $1_IntroductionToJava.Bai_Tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền VND: ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("Giá trị VND: " + quyDoi);
    }
}
