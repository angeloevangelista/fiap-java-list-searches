package buscas;

import java.util.Random;

public class Utils {
    public static int[] getList(int amount) {
        int[] values = new int[amount];

        Random random = new Random();

        for (int i = 0; i < amount; i++) {
            values[i] = random.nextInt(100);
        }

        return values;
    }

    public static void printValues(int[] values) {
        System.out.print("[ ");

        for (int i = 0; i < values.length; i++) {
            System.out.printf("%s%s ", values[i], i == values.length - 1 ? "" : ",");
        }

        System.out.print("]\n");
    }

    public static int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];

                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        return values;
    }
}
