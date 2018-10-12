package com.codecool.thehistory;

import java.util.*;

public class TheHistoryLinkedList implements TheHistory {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] splitedText = text.split("\\s+");
        for (int num=0; num<splitedText.length; num++){
            wordsLinkedList.add(splitedText[num]);
        }
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        for (int index=0; index<wordsLinkedList.size(); index++){
            if (wordToBeRemoved == wordsLinkedList.get(index)){
                wordsLinkedList.remove(index);
                index--; //inteliJ recommended to me, why?
            }
        }
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
//        why this is not working? it is returning: 1.
        return wordsLinkedList.size();
//        int size=0;
//        for(int num=0; num<wordsLinkedList.size(); num++) {
//            size = size + 1;
//        }
//        return size;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        wordsLinkedList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsLinkedList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
