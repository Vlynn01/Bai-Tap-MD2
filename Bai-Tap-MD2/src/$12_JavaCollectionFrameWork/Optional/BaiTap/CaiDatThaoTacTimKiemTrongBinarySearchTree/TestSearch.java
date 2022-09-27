package $12_JavaCollectionFrameWork.Optional.BaiTap.CaiDatThaoTacTimKiemTrongBinarySearchTree;

public class TestSearch {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(60);
        bst.add(55);
        bst.add(100);
        bst.add(45);
        bst.add(57);
        bst.add(67);
        bst.add(107);

        bst.preOrder();

        System.out.println("\n67 is: " + bst.search(67));
    }
}