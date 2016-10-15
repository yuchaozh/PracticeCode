/**
 Find the target key K in the given binary search tree, return the node that contains the key if K is found, otherwise return null.

 Assumptions

 There are no duplicate keys in the binary search tree

 * Created by yuchaozh on 2016/10/15.
 */

/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */

public class SearchInBinarySearchTree {
    // // Recursive
    // public TreeNode search(TreeNode root, int key) {
    //   // need to check root == null first before check root.key == key
    //   if (root == null || root.key == key) {
    //     return root;
    //   }
    //   // check left node if target less than root.key
    //   if (key < root.key) {
    //     // 这里为什么要加return？前面的return不行么？
    //     return search(root.left, key);
    //   } else {
    //     // check right node if target greater than root.key
    //     return search(root.right, key);
    //   }
    // }

    // Iterative
    // public TreeNode search(TreeNode root, int key) {
    //   TreeNode current = root;
    //   while (current != null && current.key != key) {
    //     if (key < current.key) {
    //       current = current.left;
    //     } else {
    //       current = current.right;
    //     }
    //   }
    //   // exit loop: root == null || root.key == key
    //   return current;
    // }

    public TreeNode search(TreeNode root, int key) {
        while (root != null && root.key != key) {
            if (key < root.key) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        // exit loop: root == null || root.key == key
        return root;
    }
}
