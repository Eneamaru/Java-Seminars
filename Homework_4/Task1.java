package Homework_4;

//Даны два Deque, представляющие два целых числа.
//Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//        1) Умножьте два числа и верните произведение в виде связанного списка.
//        2) Сложите два числа и верните сумму в виде связанного списка.
//        Одно или два числа могут быть отрицательными.
//
//        Даны два Deque, цифры в обратном порядке.
//        [3,2,1] - пример Deque
//        [5,4,3]- пример второго Deque
//        1) 123 * 345 = 42 435
//        Ответ всегда - связный список, в обычном порядке
//        [4,2,4,3,5] - пример ответа

import java.util.Deque;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        Deque<Integer> num1 = new LinkedList<>();
        num1.addLast(3);
        num1.addLast(2);
        num1.addLast(1);

        Deque<Integer> num2 = new LinkedList<>();
        num2.addLast(5);
        num2.addLast(4);
        num2.addLast(3);

        Deque<Integer> multipliedResult = multiply(num1, num2);
        System.out.println("Результат умножения: " + multipliedResult);

        LinkedList<Integer> addedResult = add(num1, num2);
        System.out.println("Результат сложения: " + addedResult);
    }

    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        int size1 = num1.size();
        int size2 = num2.size();
        int[] result = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            int digit1 = num1.removeFirst();
            int carry = 0;

            for (int j = 0; j < size2; j++) {
                int digit2 = num2.removeFirst();
                int product = digit1 * digit2 + result[i + j] + carry;
                result[i + j] = product % 10;
                carry = product / 10;
                num2.addLast(digit2);
            }

            if (carry > 0) {
                result[i + size2] += carry;
            }

            num1.addLast(digit1);
        }

        Deque<Integer> resultList = new LinkedList<>();
        int i = size1 + size2 - 1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }

        if (i < 0) {
            resultList.addLast(0);
        } else {
            while (i >= 0) {
                resultList.addLast(result[i]);
                i--;
            }
        }

        return resultList;
    }

    public static LinkedList<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        LinkedList<Integer> result = new LinkedList<>();

        int carry = 0;
        while (!num1.isEmpty() || !num2.isEmpty()) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeFirst();
            int digit2 = num2.isEmpty() ? 0 : num2.removeFirst();
            int sum = digit1 + digit2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.add(carry);
        }

        return result;
    }
}