package $13_ThuatToanTimKiem.Optional.TinhDoPhucTapCuaThuatToan;

import java.util.Scanner;

//Tạo lớp AlgorithmComplexityTest, viết hàm main cho phép nhập vào một chuỗi ký tự
public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        /*codes below here */

        //Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
        }

        //Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;                                             //{5}
        char character = (char) 255; /* empty character */      //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

    }

}

