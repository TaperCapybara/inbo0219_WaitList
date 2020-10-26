package ru.mirea.inbo0219_WaitList;

import java.util.*;

public class UnfairWaitList<E> extends WaitList {

    Vector<E> ArrayUnfair = new Vector();

    public UnfairWaitList(Collection<E> c){
        Iterator<E> it = c.iterator();
        while (it.hasNext()){
            this.ArrayUnfair.add(it.next());
        }
    }

    void remove (E element){
        ArrayUnfair.remove(element);
    }

    void moveToBack (E element){
        ArrayUnfair.remove(element);
        ArrayUnfair.add(element);
    }

    @Override
    public String toString(){
        return String.valueOf(ArrayUnfair) + "\n";
    }
}
