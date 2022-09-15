package $3_MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        //Khai báo mảng chứa danh sách sinh viên
        String[] students = {"Cự", "Kim Anh", "Luận", "Hồng Linh", "Nguyên", "Bảo Sơn", "Tuấn", "Định", "Tình", "Khánh Linh"};
        //Khai báo biến lưu tên tìm kiếm và  gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học viên: ");
        String input_name = scanner.nextLine();
        //Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của các sinh viên trong danh sách " + input_name + " là " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + input_name + " trong danh sách.");
        }
    }
}
