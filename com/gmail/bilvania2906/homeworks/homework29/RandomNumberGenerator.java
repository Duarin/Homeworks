package com.gmail.bilvania2906.homeworks.homework29;

import java.util.Random;

class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
