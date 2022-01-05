package model;

import java.util.Random;

public class RandomNumberGenerator {

    public static int getRandomInt(int lowerBound, int upperBound){
        // Note: possible generated ints include lowerBound and upperBound.
        if (lowerBound > upperBound){
            int storageInt = upperBound;
            upperBound = lowerBound;
            lowerBound = storageInt;
        }
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randomInt;
    }
}
