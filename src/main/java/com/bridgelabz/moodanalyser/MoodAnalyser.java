package com.bridgelabz.moodanalyser;

 // @Purpose : Ability to analyse mood and respond either happy or sad

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else
            return null;

    }
}
