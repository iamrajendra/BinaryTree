package postorder.search;

class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}

public class Tree{
    Node root;

  Tree() {
          root = null;
          }

          void postOrder(Node node) {
          if (node == null)
          return;

          // traverse the left child
              postOrder(node.left);
          // traverse the right child
              postOrder(node.right);
              // traverse the root node
              System.out.print(node.item + "->");

          }

public static void main(String[] args) {
        // create object of tree
        Tree tree = new Tree();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        // preorder tree traversal
        System.out.println("\nPreorder traversal ");
        tree.postOrder(tree.root);
        }


}