/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/8/2021
 *   Time: 4:17 PM
 *   File: Main.java
 */

package binarysearchtree.main;

import binarysearchtree.implementation.Tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> integerTree = new Tree<>();
        System.out.println(integerTree.insert(32));
        System.out.println(integerTree.insert(13));
        System.out.println(integerTree.insert(69));
        System.out.println(integerTree.insert(37));
        System.out.println(integerTree.insert(47));
        integerTree.preOrder(integerTree.getRoot());
        System.out.println();
        integerTree.postOrder(integerTree.getRoot());
        System.out.println();
        integerTree.inOrder(integerTree.getRoot());
        System.out.println(integerTree.search(13));
        System.out.println(integerTree.search(69));
        System.out.println(integerTree.search(15));
        System.out.println(integerTree.search(67));
    }
}