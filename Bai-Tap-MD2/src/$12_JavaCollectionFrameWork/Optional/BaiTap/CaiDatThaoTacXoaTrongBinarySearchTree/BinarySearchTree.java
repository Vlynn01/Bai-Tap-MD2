package $12_JavaCollectionFrameWork.Optional.BaiTap.CaiDatThaoTacXoaTrongBinarySearchTree;


public class BinarySearchTree {
    private Node root;

    private Node addNodes(Node root, int data) {
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
        return addNodes(temp, data);
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        addNodes(root, data);
    }

    private int minValue(Node node) {
        if (node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getData();
    }

    private Node removeNode(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.getData()) {
            root.setLeft(removeNode(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(removeNode(root.getRight(), data));
        } else {
            if (root.getLeft() == null & root.getRight() == null) {
                return null;
            } else if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            } else {
                int min = minValue(root.getRight());
                root.setData(min);
                root.setRight(removeNode(root.getRight(), min));
            }
        }
        return root;
    }

    public void remove(int data) {
        removeNode(root, data);
    }

    private void doInOrder(Node root) {
        if (root == null) {
            return;
        }
        doInOrder(root.getLeft());
        System.out.print(root.getData() + "\t");
        doInOrder(root.getRight());
    }

    public void inOrder() {
        doInOrder(root);
    }
}