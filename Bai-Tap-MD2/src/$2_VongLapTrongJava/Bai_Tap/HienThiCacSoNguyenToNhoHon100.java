package $2_VongLapTrongJava.Bai_Tap;

public class HienThiCacSoNguyenToNhoHon100 {
    //cách 1
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean check = true;

            for (int j = 2; j < i; j++) {
                //for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}

//cách 2
//  public static void main(String[] args) {
//        int flag = 1;
//
//        for (int i = 2; i < 100; i++) {
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    flag += 1;
//                }
//            }
//
//            if (flag == 1) {
//                System.out.println(i);
//
//            }
//            flag = 1;
//        }
//    }
