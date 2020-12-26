package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //Google helped me!

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String text = scanner.next();
        findFirstRepeatedCharacter(text);
    }

    static void findFirstRepeatedCharacter(String text) {

        HashMap<Character, Integer> counter = new HashMap<>();
        char[] array = text.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (counter.containsKey(array[i])) {
                counter.put(array[i], counter.get(array[i]) + 1);
            } else {
                counter.put(array[i], 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (counter.get(array[i]) > 1) {
                System.out.println("First repeated character is '" + array[i] + "'.");
                break;
            }
        }
    }
}
