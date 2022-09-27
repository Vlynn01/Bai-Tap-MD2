package $12_JavaCollectionFrameWork.Optional.BaiTap.CaiDatThaoTacDuyetTheoThuTuPreorderTrongBinarySearchTree;

public class BinarySearchTree {
    private Node root;

    private Node addNode(Node root, int data) {
        Node temp;
        if (root.getData() >= data) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(data));
                return root.getLeft();
            } else {
                temp = root.getLeft();
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new Node(data));
                return root.getRight();
            } else {
                temp = root.getRight();
            }
        }
        return addNode(temp, data);
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        addNode(root, data);
    }

    private void doPreOrder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }

    public void preOrder() {
        doPreOrder(root);
    }
}