package com.netcracker.collections.creationLinkedList;

public class Node<E> {
    protected E elem;
    protected Node<E> nextNode;
    protected Node<E> prevNode;

    public Node(E elem, Node<E> nextNode, Node<E> prevNode) {
        this.elem = elem;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public Node(E element) {
        this.elem = element;
    }

    public E getElement() {
        return elem;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public Node<E> getPrevNode() {
        return prevNode;
    }

    public void setElement(E element) {
        this.elem = element;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(Node<E> prevNode) {
        this.prevNode = prevNode;
    }
}
