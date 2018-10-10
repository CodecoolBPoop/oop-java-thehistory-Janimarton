package com.codecool.thehistory;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray;

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] splitedString = text.split("\\s+");
        wordsArray = new String[splitedString.length];
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i]=splitedString[i];
        }

    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i] == wordToBeRemoved) {
                wordsArray[i] = "";
            }
        }
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        int sizeNumber =0;
        for (int i =0; i<wordsArray.length; i++){
            sizeNumber = sizeNumber + 1;
        }

        return sizeNumber;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        wordsArray = null;
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        for (int i =0; i<wordsArray.length; i++){
            if (wordsArray[i] == from){
                wordsArray[i] = to;
            }
        }

    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
