package $14_ThuatToanSapXep.BaiTap.MinhHoaThuatToanSapXepChen;

public class DemoInsertionSort {
    static int[] list = {5, 12, 9, 3, 2, 15, 11, 4, 32, 17, 18};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            System.out.println("Lấy ra phần tử " + currentElement);
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                System.out.println("Thay thế vị trí phần tử " + list[j + 1] + " bằng " + list[j]);
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
            System.out.println("Chèn " + list[j + 1] + " vào vị trí thứ " + (j + 2) + "\n");
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Dãy sau khi sắp xếp là: ");
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}