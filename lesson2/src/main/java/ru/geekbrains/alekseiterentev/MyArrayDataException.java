package ru.geekbrains.alekseiterentev;

public class MyArrayDataException extends Exception {

    private int i;
    private int j;

    public MyArrayDataException(Throwable cause, int i, int j) {
        super(cause);
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
