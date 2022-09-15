package $2_VongLapTrongJava.Bai_Tap;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        //In hình chữ nhật
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //In hình tam giác vuông, có cạnh góc vuông ở botton-left
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        //In hình tam giác vuông, có cạnh góc vuông ở top-left
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //In hình tam giác cân
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i + "*" + i);
            }
            System.out.println();
        }

    }

}


