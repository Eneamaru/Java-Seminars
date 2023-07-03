package Homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

// Пример меню:
// 1) Добавить контакт
// 2) Вывести всех
// 3) Выход

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("1) Добавить контакт");
            System.out.println("2) Показать все контакты");
            System.out.println("3) Выход");
            System.out.print("Выберите пункт: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите телефонный номер: ");
                    String phoneNumber = scanner.nextLine();

                    if (phoneBook.containsKey(name)) {
                        List<String> numbers = phoneBook.get(name);
                        numbers.add(phoneNumber);
                    } else {
                        List<String> numbers = new ArrayList<>();
                        numbers.add(phoneNumber);
                        phoneBook.put(name, numbers);
                    }
                    break;
                case 2:
                    System.out.println("Все записи в телефонной книге:");
                    List<Map.Entry<String, List<String>>> sortedEntries =
                            new ArrayList<>(phoneBook.entrySet());
                    sortedEntries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());

                    for (Map.Entry<String, List<String>> entry : sortedEntries) {
                        String contactName = entry.getKey();
                        List<String> contactNumbers = entry.getValue();
                        System.out.println(contactName + ": " + contactNumbers);
                    }
                    break;
                case 3:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте ещё раз.");
            }

            System.out.println();
        } while (choice != 3);
    }
}