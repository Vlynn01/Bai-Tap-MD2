package $12_JavaCollectionFrameWork.ThucHanh.SuDungHashMap_LinkedHashMap_TreeMapDeLuuDanhSachSinhVienTheoDoTuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Tạo lớp TestMap chứa phương thức main
public class TestMap {
        public static void main(String[] args) {
            //Tạo HashMap trong main để lưu danh sách sinh viên
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Smith", 30);
            hashMap.put("Anderson", 31);
            hashMap.put("Lewis", 29);
            hashMap.put("Cook", 29);
            System.out.println("Display entries in HashMap");
            System.out.println(hashMap + "\n");

            //Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
            Map<String, Integer> treeMap = new TreeMap<>(hashMap);
            System.out.println("Display entries in ascending order of key");
            System.out.println(treeMap);


            //Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
            linkedHashMap.put("Smith", 30);
            linkedHashMap.put("Anderson", 31);
            linkedHashMap.put("Lewis", 29);
            linkedHashMap.put("Cook", 29);
            System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        }



}
