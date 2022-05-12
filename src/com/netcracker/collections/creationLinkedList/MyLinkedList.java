package com.netcracker.collections.creationLinkedList;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    private int counter = 0;

    public MyLinkedList() {
    }

    private void addToStart(E element) {
        Node<E> node = first;
        Node<E> newNode = new Node<>(element, node, null);
        first = newNode;
        if (node == null) {
            throw new NullPointerException();
        } else
            newNode.prevNode = node;
        size++;
    }

    private void addToEnd(E element) {
        Node<E> node = last;
        Node<E> newNode = new Node<>(element, null, node);
        last = newNode;
        if (node == null) {
            first = newNode;
        } else {
            node.nextNode = newNode;
        }
        size++;
    }

    @Override
    public void add(E element) {
        addToEnd(element);
    }

    @Override
    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        if ((index == 0 && size == 0) | (index == size)) {
            addToEnd(element);
        } else if (index == 0) {
            addToStart(element);
        } else {
            int countNode = 0;
            if ((index > 0) & (index - 1) < size) {
                for (Node<E> currNode = first; first != null; ) {
                    if (countNode == index - 1) {
                        Node<E> newNode = new Node<E>(element, currNode.nextNode, currNode);
                        currNode.nextNode.prevNode = newNode;
                        currNode.nextNode = newNode;
                        size++;
                        break;
                    }
                    currNode = currNode.nextNode;
                    countNode++;
                }
            }
        }
    }

    @Override
    public void clear() {
        if (first != null) {
            for (Node<E> currNode = first; currNode != null; ) {
                Node<E> nextNode = currNode.nextNode;
                currNode.elem = null;
                currNode.nextNode = null;
                currNode.prevNode = null;
                currNode = nextNode;
            }
        }
        first = last = null;
        size = 0;
    }

    private E getFirst() {
        Node<E> firstNode = first;
        if (firstNode == null) {
            throw new NullPointerException();
        } else
            return first.elem;
    }

    @Override
    public E get(int index) {
        E elemRes = null;
        if (size == 0) {
            throw new NullPointerException();
        }
        if (index == 0 & size > 0) {
            elemRes = getFirst();
        }
        if ((index > 0) & (index < size)) {
            Node<E> currNode = first;
            for (int i = 0; i < index; i++) {
                if (i != size - 1) {
                    currNode = currNode.nextNode;
                } else {
                    currNode = currNode.prevNode;
                }
            }
            elemRes = currNode.getElement();
        }
        return elemRes;
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        for (Node<E> curNode = first; curNode != null; curNode = curNode.nextNode) {
            if (element.equals(curNode.elem)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private Node<E> getCurrentNode(int index) {
        Node<E> res = null;
        int count = 0;
        for (Node<E> currNode = first; first != null; currNode = currNode.nextNode) {
            if (count != index) {
                count++;
            } else {
                res = currNode;
                break;
            }
        }
        return res;
    }

    private E disconnect(Node<E> node) {
        E elem = node.elem;
        Node<E> nextNode = node.nextNode;
        Node<E> prevNode = node.prevNode;

        if (nextNode == null) {
            last = prevNode;
        } else {
            nextNode.prevNode = prevNode;
            if (node.prevNode != null) {
                prevNode.nextNode = nextNode;
            }
        }

        if (prevNode == null) {
            first = nextNode;
        } else {
            prevNode.nextNode = nextNode;
            if (node.nextNode != null) {
                node.nextNode.prevNode = prevNode;
                node.nextNode = null;
            }
        }
        node.elem = null;
        size--;
        return elem;
    }

    @Override
    public E remove(int index) {
        if (index >= 0 & index < size) {
            return disconnect(getCurrentNode(index));
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E set(int index, E element) {
        add(index, element);
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <T> T[] toArray(T[] listArray) {
        if (listArray.length < size)
            listArray = (T[]) Array.newInstance(listArray.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = listArray;
        for (Node<E> currNode = first; currNode != null; currNode = currNode.nextNode)
            result[i++] = (T) currNode.elem;

        if (listArray.length > size)
            listArray[size] = null;

        return listArray;
    }

    private class MyListIterator implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return counter < size;
        }

        @Override
        public E next() {
            return get(counter++);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (!it.hasNext()) {
            return "Linked list is empty";
        }

        StringBuilder stringBuilder = new StringBuilder("[");
        while (true) {
            stringBuilder.append(it.next());
            if (!it.hasNext()) {
                counter = 0;
                return stringBuilder.append("]").toString();
            }
            stringBuilder.append(", ");
        }
    }
}
