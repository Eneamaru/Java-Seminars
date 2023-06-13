package Homework_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        int triangleNum = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangleNum += i;
        }

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("n-ое треугольное число: " + triangleNum);
        System.out.println("n!: " + factorial);
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
    }
}