package $4_LopVaDoiTuongTrongJava.ThucHanh.LopHinhChuNhat;

import java.util.Scanner;

public class Main {
    //Tạo class Main chứa phương thức main để thực thi chương trình
    public static void main(String[] args) {
        //Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.println("Vui lòng nhập chiều cao: ");
        double height = scanner.nextDouble();
        //Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle= new Rectangle(width, height);
        //Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle đã tạo để hiển thị các thông số của hình chữ nhật
        System.out.println("Hình chữ nhật của bạn  \n" +rectangle.display());
        System.out.println("Chu vi của Hình chữ nhật: "+rectangle.getPerimeter());
        System.out.println("Diện tích Hình chữ nhật: "+ rectangle.getArea());
    }

}
