package ru.geekbrains.alekseiterentev.task02;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "1234567890");
        phoneBook.add("Иванов", "1234567891");

        phoneBook.add("Петров", "1234567892");

        phoneBook.add("Сидоров", "1234567893");
        phoneBook.add("Сидоров", "1234567894");
        phoneBook.add("Сидоров", "1234567895");

        System.out.println(Arrays.toString(phoneBook.get("Сидоров").toArray()));
    }
}
