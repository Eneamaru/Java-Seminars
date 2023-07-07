package Homework_6;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> Notebooks = new HashSet<>();

        Notebook Notebook1 = new Notebook("Asus", 8, 512, "Windows", "black");
        Notebook Notebook2 = new Notebook("Apple", 16, 1024, "MacOS", "white");
        Notebook Notebook3 = new Notebook("Dell", 8, 256, "Windows", "grey");
        Notebook Notebook4 = new Notebook("Lenovo", 16, 512, "Linux", "grey");
        Notebook Notebook5 = new Notebook("Razer", 8, 512, "Linux", "black");

        Notebooks.add(Notebook1);
        Notebooks.add(Notebook2);
        Notebooks.add(Notebook3);
        Notebooks.add(Notebook4);
        Notebooks.add(Notebook5);

        System.out.println("Добро пожаловть в наш каталог!");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        HashMap<String, Object> filters = new HashMap<>();
        HashSet<Notebook> result = new HashSet<>();
        while (!flag) {

            System.out.println(
                    "Выберите характеристики: \n1. Оперативная память\n2. Жёсткий диск\n3. Операционная система\n4. Цвет\n0. Поиск");
            String n = scanner.next();

            switch (n) {
                case ("1"): {
                    System.out.print("Введите минимальную оперативную память: ");
                    Integer userRAM = scanner.nextInt();
                    filters.put("RAM", userRAM);
                    break;
                }
                case ("2"): {
                    System.out.print("Введите минимальный объем ЖД: ");
                    Integer userHD = scanner.nextInt();
                    filters.put("HD", userHD);
                    break;
                }
                case ("3"): {
                    System.out.print("Выберите ОС(Windows, MacOS, Linux): ");
                    String userOS = scanner.next();
                    filters.put("OS", userOS);
                    break;
                }
                case ("4"): {
                    System.out.print("Выберите цвет('white', 'grey', 'black'): ");
                    String userColor = scanner.next();
                    filters.put("color", userColor);
                    break;
                }
                case ("0"): {
                    flag = true;
                    System.out.println();
                    System.out.println("По запросу: " + filters);

                    for (Map.Entry<String, Object> el : filters.entrySet()) {
                        if (el.getKey().equals("RAM")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = (Notebook) it.next();
                                if (nb.getRAM() >= (Integer) el.getValue()) {
                                    result.add(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("RAM")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = it.next();
                                if (nb.getRAM() < (Integer) el.getValue()) {
                                    result.remove(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("HD")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = (Notebook) it.next();
                                if (nb.getHD() >= (Integer) el.getValue()) {
                                    result.add(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("RAM")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = it.next();
                                if (nb.getHD() < (Integer) el.getValue()) {
                                    result.remove(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("OS")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = (Notebook) it.next();
                                if (nb.getOS().equals(el.getValue())){
                                    result.add(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("OS")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = it.next();
                                if (nb.getOS() != el.getValue()) {
                                    result.remove(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("color")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = (Notebook) it.next();
                                if (nb.getColor().equals(el.getValue())) {
                                    result.add(nb);
                                }
                            }
                        }
                        if (el.getKey().equals("color")) {
                            Iterator<Notebook> it = Notebooks.iterator();
                            while (it.hasNext()) {
                                Notebook nb = it.next();
                                if (nb.getColor() != el.getValue()) {
                                    result.remove(nb);
                                }
                            }
                        }
                    }

                    Iterator<Notebook> it = result.iterator();
                    while (it.hasNext()) {
                        Notebook nb = (Notebook) it.next();
                        System.out.println("\n Найдено: " + nb.toString());
                    }
                }
                // default:
                //     throw new IllegalStateException("Неожидаемое значение: " + n);
            }
        }
    }
}