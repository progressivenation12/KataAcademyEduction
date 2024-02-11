package org.javaCore.module1;

public class Task_1_6_11 {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[]{"Городничий",
                        "Аммос Федорович",
                        "Артемий Филиппович",
                        "Лука Лукич"},
                new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"}));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder builderResult = new StringBuilder();

    for (String role : roles) {
        builderResult.append(role).append(':').append("\n");

        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(role) && textLines[i].indexOf(role) == 0) {
                builderResult.append(i + 1)
                        .append(") ")
                        .append(textLines[i].replaceFirst(role + ": ", ""))
                        .append("\n");
            }
        }
        builderResult.append("\n");
    }
    return builderResult.toString();
    }
}
