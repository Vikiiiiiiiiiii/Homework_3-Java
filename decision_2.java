// 3. Задан целочисленный список ArrayList. Найти минимальное, 
// максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
public class decision_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(19);
        numbers.add(1);
        numbers.add(16);
        numbers.add(7);
        System.out.println("Начальный список: " + numbers);
        
        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
                sum += num;
        }

        double average = (double) sum / numbers.size();
      
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}

