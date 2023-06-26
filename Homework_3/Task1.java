package Homework_3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 5, 2, 7, 8, 4, 1, 6, 9, 10));

        numbers.removeIf(num -> num % 2 == 0);

        int minimum = numbers.stream().min(Integer::compareTo).orElse(0);

        int maximum = numbers.stream().max(Integer::compareTo).orElse(0);

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Список без четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + minimum);
        System.out.println("Максимальное значение: " + maximum);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
