package Homework_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        Notebook notebook1 = new Notebook("Asus", 8, 512, "Windows", "black");
        Notebook notebook2 = new Notebook("Apple", 16, 1024, "MacOS", "white");
        Notebook notebook3 = new Notebook("Acer", 8, 256, "Windows", "grey");
        Notebook notebook4 = new Notebook("Lenovo", 16, 512, "Linux", "grey");
        Notebook notebook5 = new Notebook("Razer", 8, 512, "Linux", "black");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        System.out.println("Добро пожаловать в наш каталог!");
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Object> filters = new HashMap<>();
        HashSet<Notebook> result = new HashSet<>();
        while (!flag) {
            System.out.println(
                    "Выберите характеристики: \n1. Оперативная память\n2. Жёсткий диск\n3. Операционная система\n4. Цвет\n0. Поиск");
            String n = scanner.next();
            switch (n) {
                case "1": {
                    System.out.print("Введите минимальную оперативную память: ");
                    Integer userRAM = scanner.nextInt();
                    filters.put("RAM", userRAM);
                    break;
                }
                case "2": {
                    System.out.print("Введите минимальный объем ЖД: ");
                    Integer userHD = scanner.nextInt();
                    filters.put("HD", userHD);
                    break;
                }
                case "3": {
                    System.out.print("Выберите ОС(Windows, MacOS, Linux): ");
                    String userOS = scanner.next();
                    filters.put("OS", userOS);
                    break;
                }
                case "4": {
                    System.out.print("Выберите цвет('white', 'grey', 'black'): ");
                    String userColor = scanner.next();
                    filters.put("color", userColor);
                    break;
                }
                case "0": {
                    flag = true;
                    System.out.println("\nПо запросу: " + filters);
                    for (Notebook nb : notebooks) {
                        boolean match = true;
                        for (Map.Entry<String, Object> el : filters.entrySet()) {
                            if (el.getKey().equals("RAM") && nb.getRAM() < (Integer) el.getValue()) {
                                match = false;
                                break;
                            }
                            if (el.getKey().equals("HD") && nb.getHD() < (Integer) el.getValue()) {
                                match = false;
                                break;
                            }
                            if (el.getKey().equals("OS") && !nb.getOS().equals(el.getValue())) {
                                match = false;
                                break;
                            }
                            if (el.getKey().equals("color") && !nb.getColor().equals(el.getValue())) {
                                match = false;
                                break;
                            }
                        }
                        if (match) {
                            result.add(nb);
                        }
                    }
                    for (Notebook nb : result) {
                        System.out.println("\n Найдено: " + nb.toString());
                    }
                }
            }
        }
    }
}