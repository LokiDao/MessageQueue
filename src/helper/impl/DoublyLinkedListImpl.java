package helper.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import helper.List;
import model.Node;

public class DoublyLinkedListImpl<E> implements List<E> {

    // private static int size;
    // private Node<E> head = null;
    // private Node<E> tail = null;

    // @Override
    // public void clear() {
    // Node<E> currentNode = head;
    // while (currentNode != null) {
    // Node<E> nextNode = currentNode.getNext();
    // currentNode.setNext(null);
    // currentNode.setPrev(null);
    // currentNode.setValue(null);
    // currentNode = nextNode;
    // }
    // head = tail = null;
    // size = 0;
    // }

    // @Override
    // public boolean contains(Object object) {
    // return indexOf(object) != -1;
    // }

    // @Override
    // public int indexOf(Object object) {
    // int index = 0;
    // if (object == null) {
    // for (Node<E> curNode = head; curNode != null; curNode = curNode.getNext()) {
    // if (curNode.getValue() == null)
    // return index;
    // ++index;
    // }
    // } else {
    // for (Node<E> curNode = head; curNode != null; curNode = curNode.getNext()) {
    // if (curNode.getValue() == object)
    // return index;
    // ++index;
    // }
    // }

    // return -1;
    // }

    // @Override
    // public void insert(E element) {
    // insertLast(element);
    // }

    // @Override
    // public void insertFirst(E element) {
    // if (isEmpty()) {
    // head = tail = new Node<E>(null, element, null);
    // } else {
    // this.head.setPrev(new Node<>(null, element, head));
    // this.head = this.head.getPrev();
    // }
    // ++size;
    // }

    // @Override
    // public void insertLast(E element) {
    // if (isEmpty()) {
    // head = tail = new Node<E>(null, element, null);
    // } else {
    // this.tail.setNext(new Node<>(tail, element, null));
    // this.tail = this.tail.getNext();
    // }
    // ++size;
    // }

    // @Override
    // public boolean isEmpty() {
    // return size == 0;
    // }

    // @Override
    // public E peekFirst() {
    // if (isEmpty())
    // throw new NoSuchElementException("Empty List!");
    // return this.head.getValue();
    // }

    // @Override
    // public E peekLast() {
    // if (isEmpty())
    // throw new NoSuchElementException("Empty List!");
    // return this.tail.getValue();
    // }

    // @Override
    // public E remove(Node<E> node) {
    // if (node.getPrev() == null)
    // removeFirst();

    // if (node.getNext() == null)
    // removeLast();

    // if (isEmpty())
    // throw new NoSuchElementException("Empty List!");

    // final E element = node.getValue();
    // final Node<E> prev = node.getPrev();
    // final Node<E> next = node.getNext();

    // prev.setNext(next);
    // next.setPrev(prev);
    // node.setNext(null);
    // node.setPrev(null);
    // node.setValue(null);
    // --size;

    // return element;
    // }

    // @Override
    // public boolean remove(Object object) {
    // if (object == null) {
    // for (Node<E> curNode = head; curNode != null; curNode = curNode.getNext()) {
    // if (curNode.getValue() == null) {
    // remove(curNode);
    // return true;
    // }
    // }
    // } else {
    // for (Node<E> curNode = head; curNode != null; curNode = curNode.getNext()) {
    // if (curNode.getValue() == object) {
    // remove(curNode);
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // @Override
    // public E removeAt(int index) {
    // checkRangeIndex(index);

    // int i = 0;
    // Node<E> currentNode = null;

    // if (index < size / 2) {
    // currentNode = head;
    // while (i != index) {
    // currentNode = currentNode.getNext();
    // ++i;
    // }
    // } else {
    // i = size - 1;
    // currentNode = tail;
    // while (i != index) {
    // currentNode = currentNode.getPrev();
    // --i;
    // }
    // }

    // return remove(currentNode);
    // }

    // @Override
    // public E removeFirst() {
    // if (isEmpty())
    // throw new NoSuchElementException("Empty List!");

    // final Node<E> nextNode = this.head.getNext();
    // final E element = this.head.getValue();
    // this.head.setNext(null);
    // this.head.setValue(null);
    // this.head = nextNode;
    // --size;

    // if (isEmpty())
    // tail = null;
    // else
    // this.head.setPrev(null);

    // return element;
    // }

    // @Override
    // public E removeLast() {
    // if (isEmpty())
    // throw new NoSuchElementException("Empty List!");

    // final Node<E> prevNode = this.tail.getPrev();
    // final E element = this.tail.getValue();
    // this.tail.setPrev(null);
    // this.tail.setValue(null);
    // this.tail = prevNode;
    // --size;

    // if (isEmpty())
    // head = null;
    // else
    // this.tail.setNext(null);

    // return element;
    // }

    // @Override
    // public int size() {
    // return size;
    // }

    // @Override
    // public Iterator<E> iterator() {
    // return new Iterator<E>() {
    // private Node<E> currentNode = head;

    // @Override
    // public boolean hasNext() {
    // return currentNode.getNext() != null;
    // }

    // @Override
    // public E next() {
    // final E element = currentNode.getValue();
    // currentNode = currentNode.getNext();
    // return element;
    // }

    // };
    // }

    // private void checkRangeIndex(int index) {
    // if (index < 0 || index >= size)
    // throw new IllegalArgumentException();
    // }

    // @Override
    // public String toString() {

    // if (isEmpty())
    // return "[]";

    // StringBuilder builder = new StringBuilder();
    // builder.append("[");

    // int index = 0;
    // for (Node<E> curNode = head; curNode != null; curNode = curNode.getNext()) {
    // if (index == size - 1) {
    // builder.append(curNode.getValue());
    // } else {
    // builder.append(curNode.getValue())
    // .append("->");
    // }
    // }

    // builder.append("]");

    // return builder.toString();
    // }

    private int size;
    private Node<E> head = null;
    private Node<E> tail = null;

    @Override
    public void clear() {
        Node<E> currentNode = head;
        while (currentNode != null) {
            Node<E> nextNode = currentNode.getNext();
            currentNode.setNext(null);
            currentNode.setPrev(null);
            currentNode.setData(null);
            currentNode = nextNode;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void insert(E element) {
        insertLast(element);
    }

    @Override
    public void insertFirst(E element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            head.setPrev(new Node<>(element, null, head));
            head = head.getPrev();
        }
        size++;
    }

    @Override
    public void insertLast(E element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            tail.setNext(new Node<>(element, tail, null));
            tail = tail.getNext();
        }
        size++;
    }

    @Override
    public E peekFirst() {
        if (isEmpty())
            throw new RuntimeException("Empty linked list!");
        return head.getData();
    }

    @Override
    public E peekLast() {
        if (isEmpty())
            throw new RuntimeException("Empty linked list!");
        return tail.getData();
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            throw new RuntimeException("Empty linked list!");
        E data = head.getData();
        head = head.getNext();
        size--;
        if (isEmpty())
            tail = null;
        else
            head.setPrev(null);

        return data;
    }

    @Override
    public E removeLast() {
        if (isEmpty())
            throw new RuntimeException("Empty linked list!");
        E data = tail.getData();
        tail = tail.getPrev();
        size--;
        if (isEmpty())
            head = null;
        else
            tail.setNext(null);

        return data;
    }

    @Override
    public E remove(Node<E> node) {
        if (node.getPrev() == null)
            removeFirst();
        if (node.getNext() == null)
            removeLast();

        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());

        E data = node.getData();
        size--;

        node.setData(null);
        node.setNext(null);
        node.setPrev(null);
        node = null;

        return data;
    }

    @Override
    public boolean remove(Object object) {
        Node<E> currentNode = head;

        if (object == null) {
            while (currentNode != null) {
                if (currentNode.getData() == null) {
                    remove(currentNode);
                    return true;
                }
                currentNode = currentNode.getNext();
            }
        } else {
            while (currentNode != null) {
                if (currentNode.getData() == object) {
                    remove(currentNode);
                    return true;
                }
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    @Override
    public E removeAt(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        int i;
        Node<E> currentNode;

        if (index < size / 2) {
            i = 0;
            currentNode = head;
            while (i != index) {
                currentNode = currentNode.getNext();
                i++;
            }
        } else {
            i = size - 1;
            currentNode = tail;
            while (i != index) {
                currentNode = currentNode.getPrev();
                i--;
            }
        }

        return remove(currentNode);
    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        Node<E> currentNode = head;

        if (object == null) {
            while (currentNode != null) {
                if (currentNode.getData() == null) {
                    return index;
                }
                currentNode = currentNode.getNext();
                index++;
            }
        } else {
            while (currentNode != null) {
                if (currentNode.getData() == object) {
                    return index;
                }
                currentNode = currentNode.getNext();
                index++;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private boolean isEntering = true;
            private Node<E> currentNode = null;

            @Override
            public boolean hasNext() {
                if (isEntering) {
                    return head != null;
                }
                return currentNode.getNext() != null;
            }

            @Override
            public E next() {
                E data = null;
                if (isEntering) {
                    data = head.getData();
                    currentNode = head;
                    isEntering = false;
                } else {
                    currentNode = currentNode.getNext();
                    data = currentNode.getData();
                }
                return data;
            }
        };
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(size);
            sb.append("[ ");

            Node<E> currentNode = head;

            while (currentNode != null) {
                sb.append(currentNode.getData());
                if (currentNode.getNext() != null)
                    sb.append(", ");
                currentNode = currentNode.getNext();
            }
            sb.append(" ]");
            return sb.toString();
        }
    }
}
