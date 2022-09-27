package $13_ThuatToanTimKiem.Optional.BaiTap.CatDatThuatToanTimKiemNhiPhanSuDungDeQuy;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int number;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            number = (int) Math.floor(Math.random() * 1000);
            array[i] = number;
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }

        int value = BinarySearch.binarySearch(array, 0, array.length - 1, 0);
        long endTime = System.currentTimeMillis();
        System.out.println("\nIndex of 31 is: " + value);
        System.out.println("Execution time: " + (endTime - startTime) + " miliseconds");
    }
}