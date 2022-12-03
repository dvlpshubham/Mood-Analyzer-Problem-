package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    /**
     * Method to check the sad mood. Provided string with sad then method should
     * return sad. Used the assert equals to check if the method output is sad.
     */
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        moodAnalyser.setMessage("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }

    /**
     * Method to check the happy mood. Provided string with happy then method should
     * return happy. Used the assert equals to check if the method output is happy.
     */

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        moodAnalyser.setMessage("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }

    @Test
    public void givenMessage_IsAny_ShouldReturnAny() {
        moodAnalyser.setMessage("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
    /**
     * Method to check if mood is invalid. it should return Invalid Mood assert
     * equals to check if the method output is Invalid Mood
     */
    @Test
    public void givenMessage_IsInvalid_ShouldReturnHappy() {
        moodAnalyser.setMessage(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
}
