package ru.geekbrains.alekseiterentev.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();

    public void add(String surname, String phone) {
        if (this.phoneBook.containsKey(surname)) {
            this.phoneBook.get(surname).add(phone);
        } else {
            List<String> phones = new ArrayList<String>();
            phones.add(phone);
            this.phoneBook.put(surname, phones);
        }
    }

    public List<String> get(String surname) {
        if (this.phoneBook.containsKey(surname)) {
            return Collections.unmodifiableList(this.phoneBook.get(surname));
        } else {
            return Collections.emptyList();
        }
    }
}
