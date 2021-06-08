/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/8/2021
 *   Time: 4:17 PM
 *   File: Tree.java
 */

package binarysearchtree.implementation;

public class Tree<E extends Comparable<E>> {

    private Node<E> root = null;

    public Tree() {
    }

    public Tree(Node<E> root) {
        this.root = root;
    }


    public boolean insert(E element) {
        boolean isSuccess = false;
        if (root == null) {
            Node node = new Node(element);
            root = node;
            isSuccess = true;
        } else {
            Node temp = root;
            Node parent = null;
            while (temp!=null){
                parent = temp;
                if(element.compareTo((E) temp.getData())>=0){
                    temp = temp.getRightChild();
                }else{
                    temp = temp.getLeftChild();
                }
            }
            if(element.compareTo((E) parent.getData())>=0){
                parent.setRightChild(new Node(element));
            } else {
                parent.setLeftChild(new Node(element));
            }
            isSuccess = true;
        }
        return isSuccess;
    }

    private boolean hasRightChild(Node<E> temp) {
        if (temp.getRightChild() != null && temp.getLeftChild() == null) {
            return true;
        }
        return false;
    }

    private boolean hasLeftChild(Node<E> temp) {
        if (temp.getLeftChild() != null && temp.getRightChild() == null) {
            return true;
        }
        return false;
    }

    private boolean isLeaf(Node<E> temp) {
        if (temp.getLeftChild() == null && temp.getRightChild() == null) {
            return true;
        }
        return false;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }

    public int height(Node<E> node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
        }
    }

    public void preOrder(Node<E> node) {
        if (node == null) {
            return;
        } else {
            System.out.print(node.getData() + ",");
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    public void inOrder(Node<E> node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            System.out.print(node.getData() + ", ");
            inOrder(node.getRightChild());
        } else {
            return;
        }
    }

    public void postOrder(Node<E> node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.print(node.getData() + ", ");
        } else {
            return;
        }
    }
}