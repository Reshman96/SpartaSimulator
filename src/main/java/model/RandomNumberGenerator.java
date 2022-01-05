package model;

import java.util.Random;

public class RandomNumberGenerator {

    public static int getRandomInt(int lowerBound, int upperBound){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randomInt;
    }
}
