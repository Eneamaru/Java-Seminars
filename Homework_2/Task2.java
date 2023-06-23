package Homework_2;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Task2");
        FileHandler fh;

        try {
            fh = new FileHandler("Task2.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
            int n = arr.length;

            logger.info("Изначальный массив: " + Arrays.toString(arr));

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                logger.info("Массив после итерации " + (i + 1) + ": " + Arrays.toString(arr));
            }

            logger.info("Отсортированный массив: " + Arrays.toString(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
