package ru.job4j;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                result = result.concat(String.valueOf(input.charAt(i - 1)));
                result = result.concat(counter > 1 ? String.valueOf(counter) : "");
                counter = 1;
            }
        }
        result = result.concat(String.valueOf(input.charAt(input.length() - 1)));
        result = result.concat(counter > 1 ? String.valueOf(counter) : "");

        return result;
    }
}
