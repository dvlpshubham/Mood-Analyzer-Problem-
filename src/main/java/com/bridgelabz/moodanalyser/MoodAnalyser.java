package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;

    /**
     * Parameterized constructor and passing message.
     *
     * @param message - String message to be checked by methods.
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     *  Default constructor.
     */
    public MoodAnalyser() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Method to check if mood is happy or sad Convert the message to lower case and
     * Check if the string contains happy or sad word in it. Using if else return
     * Happy or Sad string.
     *
     * @param message - String message from the main method.
     * @return - We will return the mood Happy or Sad
     */
    public String analyseMood() {
        try {
            if (message.toLowerCase().contains("happy")) {
                return "Happy";
            } else if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else if (message.toLowerCase().contains("any")) {
                return "Happy";
            } else {
                return "Any";
            }
        } catch (NullPointerException e) {
            return "Invalid Mood";
        }
    }
}
