package ru.mirea.inbo0219_WaitList;
import java.util.*;
public interface IWaitList<E> {

    void add (E obj);
    E remove();
    boolean contains (E obj);
    boolean containsAll(Collection<E> Collection);
    boolean isEmpty();
}
