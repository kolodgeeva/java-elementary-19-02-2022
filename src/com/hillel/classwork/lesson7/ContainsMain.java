package com.hillel.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ContainsMain {

    public static void main(String[] args) throws IOException {
        /*
        Створити список слів
        Заповнити список з консолі
        Поки користувач не введе слово стоп
        Перевірити чи в списку слів заборонені
        в оркстані слова - війна
         */

        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).equals("stop")) {
            words.add(input);
        }

        if (words.contains("war")) {
            System.out.println("знайдено заборонене слово");
        }

        // порахуйте заборонені слова
        int count = 0;
        for (String word: words) {
            if (word.equals("war")) {
                count++;
            }
        }

        System.out.println("кількість заборонених слів: " + count);

    }
}
