
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(Object[] elements ,int size) {
        this.elements=elements;
        this.size=size;
    }
    public MyList(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else if (capacity == 0) {
            this.elements = new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    capacity);
        }
    }

    public void add(int index, E element) {
        if (index > size) {
            throw new UnsupportedOperationException("Index must be smaller than size");
        }
        if (index < 0) {
            throw new UnsupportedOperationException("Index must be greater than 0");
        }
        if (size == elements.length) {
            ensureCapacity();
        }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
        size++;
    }
    public E remove(int index) {
        if (index>=size|| index<0) {
            throw new IndexOutOfBoundsException("Index must be smaller than size and greater than 0 ");
        }
        E element = (E) elements[index];
        int newSize = elements.length-1;
        System.arraycopy(elements,index+1,elements,index,size-(index+1));
        elements = Arrays.copyOf(elements,newSize);
        size--;
        return element;
    }

    public void ensureCapacity() {
        int newSize = elements.length +1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size() {
        return size;
    }
    public MyList<E> clone() {
        Object[] result = Arrays.copyOf(elements, size());
        return  new MyList<>(result,size);
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
