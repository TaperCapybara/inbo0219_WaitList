package ru.mirea.inbo0219_WaitList;
import java.lang.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class WaitList<E> implements IWaitList<E>  {

    Vector<E> Collection = new Vector();

    WaitList(){};
    WaitList(Collection<E> c){
        Iterator<E> it = c.iterator();
        while (it.hasNext()){
            this.Collection.add(it.next());
        }
    }

    @Override
    public String toString(){
        return String.valueOf(Collection) + "\n";
    }

    public void add(E obj) {
        Collection.add(obj);
    }

    public E remove() {
        return Collection.remove(0);
    }

    public boolean contains(E obj) {
        return Collection.contains(obj);
    }

    public boolean containsAll(Collection<E> Collection) {
        return this.Collection.containsAll(Collection);
    }

    public boolean isEmpty() {
        return this.Collection.isEmpty();
    }
}
