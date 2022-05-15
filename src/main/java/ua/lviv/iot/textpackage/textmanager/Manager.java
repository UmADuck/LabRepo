package ua.lviv.iot.textpackage.textmanager;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    public void printWordsFromAskQuestions(String text, int numberOfSymbols){
        //Splitting String into substrings by "?"
        String[] splitTextArray = text.split("\\?");
        System.out.println(splitTextArray.length);

        //Each element of splitTextArray has last sentence as a question
        //So adding only last sentence of each element to List
        List<String> askQuestionsList = new ArrayList<>();
        for (String s : splitTextArray) {
            String[] tempArr = s.split("\\.");
            for (int j = 0; j < tempArr.length; j++) {
                if (j == (tempArr.length - 1)) {
                    askQuestionsList.add(tempArr[j]);
                }
            }
        }

        //making words from Array elements as question sentences into one line
        String wordsFromQuestions = "";
        for (String temp : askQuestionsList){
            wordsFromQuestions = wordsFromQuestions + temp + " ";
        }
        //Looking for words of desired length and checking if we already have one
        List<String> uniqueWordsOfDesiredLength = new ArrayList<>();
        String[] separatedWordsFromQuestions = wordsFromQuestions.split("\s");
        for (String temp: separatedWordsFromQuestions){
            if(temp.length() == numberOfSymbols)
                if (!uniqueWordsOfDesiredLength.contains(temp)){
                    uniqueWordsOfDesiredLength.add(temp);
                }
        }
        System.out.println(uniqueWordsOfDesiredLength);

    }
}
