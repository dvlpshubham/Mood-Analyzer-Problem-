package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    /**
     * Method to check if mood is happy or sad Convert the message to lower case and
     * check if the string contains happy or sad word in it. Using if else return
     * Happy or Sad string.
     *
     * @param message - String message from the main method.
     * @return - We will return the mood Happy or Sad
     */
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else
            return null;

    }
}
