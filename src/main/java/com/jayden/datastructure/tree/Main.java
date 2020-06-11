package com.jayden.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *       1
 *    2     3
 *  4   5  6  7
 *  </pre>
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n2.setLeft(n4);
        n2.setRight(n5);
        root.setLeft(n2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n3.setLeft(n6);
        n3.setRight(n7);
        root.setRight(n3);

        System.out.println(preOrderRecursive(root));
        System.out.println(midOrderRecursive(root));
    }

    private static List<Integer> preOrderRecursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrderRecursive(root, result);
        return result;
    }

    private static void preOrderRecursive(TreeNode treeNode, ArrayList<Integer> result) {
        if (treeNode != null) {
            result.add(treeNode.getValue());
            preOrderRecursive(treeNode.getLeft(), result);
            preOrderRecursive(treeNode.getRight(), result);
        }
    }

    private static List<Integer> midOrderRecursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        midOrderRecursive(root, result);
        return result;
    }

    private static void midOrderRecursive(TreeNode treeNode, ArrayList<Integer> result) {
        if (treeNode != null) {
            midOrderRecursive(treeNode.getLeft(), result);
            result.add(treeNode.getValue());
            midOrderRecursive(treeNode.getRight(), result);
        }
    }
}
