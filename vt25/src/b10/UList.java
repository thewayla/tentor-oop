package b10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UList<E> implements Iterable<E> {
    private Object[] list;
    private int size;

    public UList() {
        this.list = new Object[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public E get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();

        return (E) list[index];
    }

    public boolean add(E obj) {
        if (contains(obj)) return false;

        if (size == list.length) {
            this.list = Arrays.copyOf(this.list, this.list.length * 2);
        }

        list[size] = obj;
        size++;
        return true;
    }

    public boolean contains(E obj) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(obj)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[");
        for (Object obj : list) {
            if (obj == null) sb.append(", ");
            else sb.append(obj).append(", ");
        }
        if (size > 0) {
            sb.delete(sb.length()-2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new UIterator();
    }

    private class UIterator implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex < size) return true;

            return false;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();

            Object obj = list[currentIndex];
            currentIndex++;
            return (E) obj;
        }
    }
}
