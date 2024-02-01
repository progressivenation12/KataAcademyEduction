package org.javaCore;

public class Task_1_6_09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
        System.out.println(isPalindrome("A palindrome is a word, number, phrase, or other sequence of characters " +
                "which reads the same backward as forward, such as madam or racecar or the number 10801."));
    }

    public static boolean isPalindrome(String text) {
    String replaceText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    StringBuilder reverseText = new StringBuilder();

    for (int i = replaceText.length() - 1; i >= 0; i--) {
        reverseText.append(replaceText.charAt(i));
    }

    return replaceText.contentEquals(reverseText);
    }
}
