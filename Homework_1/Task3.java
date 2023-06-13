package Homework_1;

import java.util.Scanner;

// Реализовать простой калькулятор (+-/*)
public class Task3 {
    public static void main(String args[]) {
        double operand1, operand2, result;
        char operator;

        try (Scanner scanner = new Scanner(System.in)){

        System.out.print("Введите первое число: ");
        operand1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        operand2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;

            case '-':
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;

            case '*':
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;

            case '/':
                if (operand2 == 0) {
                    System.out.println("Деление на 0 невозможно");
                } else {
                    result = operand1 / operand2;
                    System.out.println("Результат: " + result);
                }
                break;

            default:
                System.out.println("Некорректный оператор");
                break;
            }
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }
}
