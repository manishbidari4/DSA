// Binary Tree
class Node {
    int key;
    nodes left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    nodes root;

    BinaryTree(int key) {
        root = new nodes(key);
    }

    BinaryTree() {
        root = null;
    }

    public void traverseInOrder(nodes node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(nodes node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    public void traversePreOrder(nodes node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new nodes(1);
        tree.root.left = new nodes(2);
        tree.root.right = new nodes(3);
        tree.root.left.left = new nodes(4);

        System.out.print("Pre order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nIn order Traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPost order Traversal: ");
        tree.traversePostOrder(tree.root);
    }
}