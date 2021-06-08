/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/8/2021
 *   Time: 4:17 PM
 *   File: Node.java
 */

package binarysearchtree.implementation;

import java.util.Objects;

public class Node<E> {
    private Node<E> rightChild;
    private Node<E> leftChild;
    private E data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(getRightChild(), node.getRightChild()) && Objects.equals(getLeftChild(), node.getLeftChild()) && Objects.equals(getData(), node.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRightChild(), getLeftChild(), getData());
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node(E data) {
        this.data = data;
    }

    public Node() {
    }
}