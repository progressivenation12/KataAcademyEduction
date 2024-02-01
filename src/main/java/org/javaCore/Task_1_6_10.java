package org.javaCore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1_6_10 {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
        System.out.println(isGmailOrOutlook("@outlook.com"));
    }

    public static boolean isGmailOrOutlook(String email) {
    Pattern pattern = Pattern.compile("([a-z\\d]+)@([a-z]+).([a-z]{2,3})");
    Matcher matcher = pattern.matcher(email);

    return matcher.matches();
    }
}
