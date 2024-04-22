package com.csg;

import java.util.ArrayList;
import java.util.List;

public class CountWords {

    public static int countWordsStartsWithCharacterM (List<String> words){
        int result = 0;
        for(String word : words){
            if(word.toLowerCase().startsWith("m")){
                result++;
            }
        }
        return result;
    }

    public static List<String> countWordsLongerThan5Characters (List<String> words){
        List<String> result = new ArrayList<>();
        for(String word : words){
            if(word.length() > 5){
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        List<String> words = new ArrayList<>();
        words.add("Mango");
        words.add("mandarin");
        words.add("lychee");
        words.add("mammoth");

        int wordsWithM = countWordsStartsWithCharacterM(words);
        List<String> wordsLongerThan5 = countWordsLongerThan5Characters(words);


        System.out.println("Number of words that start with M or m = " + wordsWithM);
        System.out.println("Words longer than 5 characters = " + wordsLongerThan5);
    }
}
