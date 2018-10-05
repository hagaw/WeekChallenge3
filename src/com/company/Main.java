package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome, let's play hangman! " + "\n");

        ArrayList<String> words = new ArrayList<>();


        words.add("tree");
        words.add("rain");
        words.add("bear");
        words.add("encourage");
        words.add("promise");
        words.add("soup");
        words.add("chess");
        words.add("insurance");
        words.add("pancakes");
        words.add("stream");

        String word = wordList;
        String[] phrase = word.split("Enter guess: " + words);

        for(int i = 0; i <phrase.length; i++){
            System.out.println("_");
        }
        Scanner playerOne = new Scanner(System.in);
        String wordList = "";

        do{
            System.out.println("Here is the word I am thinking of:  ");
            wordList = playerOne.nextLine();

            System.out.println("Enter your guess");
            guess = playerOne.nextInt();
            playerOne.nextLine();

            if(guess % 10==0);

        }while{

        }
    }
}
