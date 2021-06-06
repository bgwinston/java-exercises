package org.launchcode.java.studios;

public class list {
    public static void main(String[] args) {
        String[] word = {"first", "second", "ford", "Mazda"};
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() ==5){
                System.out.println(word[i]);
            }
        }

    }
}

