package $12_JavaCollectionFrameWork.Optional.BaiTap.CaiDatThaoTacDuyetTheoThuTuPostorderTrongBinarySearchTree;

public class Tree {
    public Node root;

    public Tree() {
        root = null;
    }

    void displayTreePostOrder(Node node) {
        if (node == null) {
            return;
        }
        displayTreePostOrder(node.left);
        displayTreePostOrder(node.right);
        System.out.print(node.element + " ");
    }


    void displayTreePreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.element + " ");
        displayTreePreOrder(node.left);
        displayTreePreOrder(node.right);

    }

    void displayTreeInOrder(Node node) {
        if (node == null) {
            return;
        }

        displayTreeInOrder(node.left);
        System.out.print(node.element + " ");
        displayTreeInOrder(node.right);

    }

    void displayTreePostOrder() {
        displayTreePostOrder(root);
    }

    void displayTreePreOrder() {
        displayTreePreOrder(root);
    }

    void displayTreeInOrder() {
        displayTreeInOrder(root);
    }
}