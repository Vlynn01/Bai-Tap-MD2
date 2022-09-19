package $10_DSA_DanhSach.BaiTap.TrienKhaiCacPhuongThucCuaLinkedListThuVien_Java_Util_LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkList = new MyLinkedList("Không xác định");

        linkList.add(1,12);
        linkList.add(2,10);
        linkList.add(3,19);
        linkList.add(4,98);
        linkList.addFist("Máy khỏe thì chạy được hết haha");
        System.out.println("check: indexOf");
        System.out.println(linkList.indexOf("Yui"));
        System.out.println("---------------------");
        System.out.println("check: Display List");
        linkList.printList();
        System.out.println("-----------------");
        System.out.println("Độ dài");
        linkList.size();
        System.out.println("----------------");
        System.out.println("Check : contains");
        System.out.println(linkList.contains(10));
        System.out.println("------------------");
        System.out.println("Check : lấy phần tử trong danh sách ");
        linkList.get(2);
        System.out.println("------------------");
        System.out.println("Check : remote");
        linkList.remote(3);
        linkList.printList();
        System.out.println("-------------------");
        System.out.println("Check : All Last");
        linkList.addLast("YahariOre");
        linkList.printList();
    }
}
