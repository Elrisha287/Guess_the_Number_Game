package com.company;

import java.util.Scanner;
import java.util.Random;

class Game{

    int compInput,userInput;
    boolean result;
    int noOfGuesses = 0;

    Game(){
        Random rd = new Random();
        compInput = rd.nextInt(100);
    }

    void takeUserInput(){
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(userInput == compInput){
            System.out.printf("The number entered  by the user is matched.\nIt was %d.\nYou guessed it in %d attempts.",compInput,noOfGuesses);
            result = true;
        }
        else if(userInput > compInput){
            System.out.println("The number entered  by the user is too high.");
            result = false;
        }
        else if(userInput < compInput){
            System.out.println("The number entered  by the user is too low.");
            result = false;
        }
        return result;
    }

}

public class GuessTheNumberGame {

    public static void main(String[] args) {

        System.out.println("Let's play GUESS THE NUMBER GAME!!!");
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }

}
