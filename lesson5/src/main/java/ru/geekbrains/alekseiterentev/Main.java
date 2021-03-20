package ru.geekbrains.alekseiterentev;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        serialMethod();
        try {
            parallelMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void applyFormula(float[] arr, int offset) {
        long startOfComputing = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i + offset) / 5) * Math.cos(0.2f + (i + offset) / 5) * Math.cos(0.4f + (i + offset) / 2));
        }

        System.out.println("Время выполнения метода: "
                + (System.currentTimeMillis() - startOfComputing)
                + " мс");
    }

    static void serialMethod() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        applyFormula(arr, 0);
    }

    static void parallelMethod() throws InterruptedException {
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long startOfComputing = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        System.out.println("Время выполнения разбиения массива: "
                + (System.currentTimeMillis() - startOfComputing)
                + " мс");

        Thread thread1 = new Thread(() -> applyFormula(a1, 0));
        Thread thread2 = new Thread(() -> applyFormula(a1, h));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long startOfUnion = System.currentTimeMillis();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println("Время выполнения склейки массива: "
                + (System.currentTimeMillis() - startOfUnion)
                + " мс");

        System.out.println("Время выполнения много-поточного метода: "
                + (System.currentTimeMillis() - startOfComputing)
                + " мс");
    }
}
