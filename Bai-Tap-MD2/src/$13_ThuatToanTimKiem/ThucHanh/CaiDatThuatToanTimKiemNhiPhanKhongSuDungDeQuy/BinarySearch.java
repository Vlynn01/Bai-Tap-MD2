package $13_ThuatToanTimKiem.ThucHanh.CaiDatThuatToanTimKiemNhiPhanKhongSuDungDeQuy;
//Tạo lớp BinarySearch, khai báo một mảng số nguyên được sắp xếp theo thứ tự tăng dần.
public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    /* codes below here */
    //Cài đặt phương thức binarySearch(int[] list, int key).

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }


    //Cài đặt phương thức main để thực thi ứng dụng.
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */

    }
}
