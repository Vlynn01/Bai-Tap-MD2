package $10_DSA_DanhSach.ThucHanh.TrienKhaiLopLinkedListDonGian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=");

        MyLinkedList myLinkedList = new MyLinkedList(20);
        myLinkedList.addFist(15);
        myLinkedList.addFist(12);
        myLinkedList.addFist(13);

        myLinkedList.add(4,9);
        myLinkedList.add(3,7);
        myLinkedList.printList();
    }
}