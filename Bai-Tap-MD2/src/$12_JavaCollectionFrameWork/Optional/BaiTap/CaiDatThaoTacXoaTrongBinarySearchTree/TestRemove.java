package $12_JavaCollectionFrameWork.Optional.BaiTap.CaiDatThaoTacXoaTrongBinarySearchTree;

public class TestRemove {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);

        System.out.println("Original: ");
        bst.inOrder();

        bst.remove(40);
        System.out.println("\nAfter remove 40: ");
        bst.inOrder();

        bst.remove(60);
        System.out.println("\nAfter remove 60: ");
        bst.inOrder();
    }
}