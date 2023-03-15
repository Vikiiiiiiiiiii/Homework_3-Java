// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Iterator;

public class decision_1{
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(22);
        numbers.add(39);
        numbers.add(10);
        numbers.add(2);
        numbers.add(47);
        numbers.add(5);

        System.out.println("Начальный список: " + numbers);

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) { // чётность
                iterator.remove(); // удаление
            }
        }
        System.out.println("Полученный список с учётом удалённых чётных чисел: " + numbers);
    }
}