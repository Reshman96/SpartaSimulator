package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTests {

    @RepeatedTest(100)
    @DisplayName("Does it remain within bounds?")
    void doesItRemainWithinBounds(){
        Assertions.assertEquals(true,RandomNumberGenerator.getRandomInt(5, 10) < 11);
    }

    @RepeatedTest(100)
    @DisplayName("Does it remain within bounds with the bounds swapped?")
    void doesItRemainWithinBoundsWithTheBoundsSwapped(){
        Assertions.assertEquals(true,RandomNumberGenerator.getRandomInt(10, 5) < 11);
    }

    @Test
    @DisplayName("Does it work as expected with bounds equal?")
    void doesItWorkAsExpectedWithBoundsEqual(){
        Assertions.assertEquals(true,RandomNumberGenerator.getRandomInt(24, 24) == 24);
    }

}
