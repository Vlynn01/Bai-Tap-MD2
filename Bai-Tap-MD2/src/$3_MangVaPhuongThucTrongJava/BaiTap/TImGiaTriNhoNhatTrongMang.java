package $3_MangVaPhuongThucTrongJava.BaiTap;

public class TImGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, -4, 22, 63, -42};
        int gtMin = 0;
        for (int j : arr) {

            if (gtMin > j) {
                gtMin = j;
            }
        }
        System.out.println("min = " + gtMin);
    }

}
