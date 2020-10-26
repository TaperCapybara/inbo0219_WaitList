package ru.mirea.inbo0219_WaitList;

import java.util.Arrays;

public class BoundedWaitList<E> extends WaitList<E>{

    private Object[] a;
    int count = 0;

    public BoundedWaitList (int capacity){
        a = new Object[capacity];
    }

    public E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E) a[i];
        return e;
    }

    public int getCapacity(){
        return a.length;
    }

    public void add(E element) {
        if (count < a.length){
            a[count] = element;
            count += 1;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(a) + "\n";
    }
}
