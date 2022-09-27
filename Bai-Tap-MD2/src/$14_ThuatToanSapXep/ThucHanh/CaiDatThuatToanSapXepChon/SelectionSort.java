package $14_ThuatToanSapXep.ThucHanh.CaiDatThuatToanSapXepChon;

//Tạo lớp SelectionSort, khai báo một mảng số thực chưa được sắp xếp.
public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    // codes below here


    //Cài đặt phương thức selectionSort(int[] list).
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    //Cài đặt phương thức main để thực thi ứng dụng.
    public static void main(String[] args) {
        selectionSort(list);
        for (double v : list) System.out.print(v + " ");
    }

}