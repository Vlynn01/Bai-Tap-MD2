package $1_IntroductionToJava.Thuc_Hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {

        System.out.println("Bộ phân giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng số:");

        Scanner scanner = new Scanner(System.in); //Chương trình cần nhận giá trị các hệ số từ người dùng. Ở đây sử dụng thư viện Scanner trong gói java.util để đọc giá trị mà người dùng nhập vào console (luồng in):

        //Lần lượt chỉ dẫn người dùng và đọc các giá trị đầu vào, do hệ số của hàm bậc nhất có thể là số nguyên hoặc số thực nên ta sử dụng hàm nextDouble và lưu giá trị vào biến có kiểu double
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        //Khi a != 0, phương trình bậc nhất chắc chắn có một nghiệm, khác hẳn với khi a ==0, do đó chúng ta sẽ kiểm tra nếu a != 0 thì ngay lập tức tính nghiệm duy nhất đó, giúp chương trình sẽ rất nhanh chóng có được một phần chức năng hoạt động được.
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Truyền phương trình với x =%f!\n", answer);
        } else {
            if (b == c) {
                System.out.println("Lời giải là tất cả x!");
            } else {
                System.out.println("Không có giải pháp!");
            }

        }

    }
}
