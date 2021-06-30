package org.example;

import org.example.RandomController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class RandomControllerTest {

    @Test
    public void test_upperBound_is_correct(){
        //Arrange
        RandomController controller = new RandomController();
        //Act
        int number = controller.generateRandomNumber();
        //Assert
        Assertions.assertEquals(true, number <=100);
    }

    @Test
    public void test_lowerBound_is_correct(){
        RandomController controller = new RandomController();
        int number = controller.generateRandomNumber();
        Assertions.assertEquals(true, number >= 0);
    }

}
