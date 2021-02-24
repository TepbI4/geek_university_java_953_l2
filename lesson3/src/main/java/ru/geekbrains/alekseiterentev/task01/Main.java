package ru.geekbrains.alekseiterentev.task01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Желание");
        words.add("Семнадцать");
        words.add("Ржавый");
        words.add("Рассвет");
        words.add("Рассвет");
        words.add("Рассвет");
        words.add("Рассвет");
        words.add("Печь");
        words.add("Желание");
        words.add("Девять");
        words.add("Добросердечный");
        words.add("Возвращение");
        words.add("Родина");
        words.add("Желание");
        words.add("Один");
        words.add("Один");
        words.add("Товарный");
        words.add("Вагон");
        words.add("Желание");
        words.add("Вагон");
        words.add("Вагон");
        words.add("Желание");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Слово " + entry.getKey() + " встречается " + entry.getValue() + " раз");
        }
    }
}
