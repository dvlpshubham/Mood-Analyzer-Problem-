package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {
    /**
     * Method to check the sad mood. Provided string with sad then method should
     * return sad. Used the assert equals to check if the method output is sad.
     *
     */
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("Sad", mood);
    }
    /**
     * Method to check the happy mood. Provided string with happy then method should
     * return happy. Used the assert equals to check if the method output is happy.
     *
     */

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("Happy", mood);
    }
}
