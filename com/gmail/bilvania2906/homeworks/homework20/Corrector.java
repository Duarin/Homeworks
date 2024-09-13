package com.gmail.bilvania2906.homeworks.homework20;


public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        boolean b = true;
        for (String str : strs) {

            if (b) {
                str = str.replace('b', 'o');
            }
            if (count < str.length()) {
                count++;
            }

            stringBuilder.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder.toString();
    }
}

