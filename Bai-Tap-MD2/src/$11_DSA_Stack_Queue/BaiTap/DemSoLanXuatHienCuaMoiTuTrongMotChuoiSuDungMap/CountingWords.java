package $11_DSA_Stack_Queue.BaiTap.DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountingWords {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string= scanner.nextLine();
        System.out.println(string);
        String[] arrStr = string.split(" ");

        Map<String, Integer> map = new TreeMap<>();

        for (String str : arrStr) {
            str = str.toLowerCase();
            int countKey = 0;

            if (map.containsKey(str)) {
                countKey++;
                map.put(str, countKey);
            }else{
                map.put(str, countKey);
            }
        }
        for (Map.Entry<String, Integer> entry: map.entrySet())
            System.out.println(entry.getKey()+ " : "+entry.getValue());
    }
}
