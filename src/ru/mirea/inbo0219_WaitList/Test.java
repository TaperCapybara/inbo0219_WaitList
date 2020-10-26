/**
 * Данная программа создана для работы со списками, имеющими шаблонные типы данных
 * @param
 */

package ru.mirea.inbo0219_WaitList;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        /**
         * Создание начальных массивов. Массив "a1' инициализируем классическим способом, массив "a" - через интерфейс
         * "Collection".
         */
        int[] a1 = {4, 6, 1, 8, 5};
        Collection<Integer> a = new ArrayList<Integer>(){
            {
                add(5);
                add(6);
                add(4);
                add(9);
                add(1);
            }
        };

        WaitList o1 = new WaitList(a);
        System.out.print(o1);
        o1.add(6);
        System.out.print(o1);

        BoundedWaitList o2 = new BoundedWaitList(3);
        o2.add(4);
        o2.add(2);
        System.out.print(o2);
        o2.add(5);
        System.out.print(o2);
        o2.add(8);
        System.out.print(o2);

        UnfairWaitList o3 = new UnfairWaitList(a);
        System.out.print(o3);
        o3.remove(5);
        System.out.print(o3);
        o3.moveToBack(4);
        System.out.print(o3);
    }
}
