package co.devfoundry.patterns.singleton.task;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int score;
    private Random generator = new Random();
    private static GuessGame instance = new GuessGame();


    private GuessGame(){
    }

    public synchronized static GuessGame getInstance(){
        return instance;
    }

    public void play(){
        for(int i=0; i<10; i++) {
            int number = generator.nextInt(9);
            System.out.println("Wprowadź liczbę od 0 do 9:");

            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();

            if(number==guess){
                System.out.println("Dobrze!");
                score++;
            } else {
                System.out.println("Żle! Było: " + number);

            }
        }
    }

    public int getScore(){
        System.out.println("Wynik: "+ score);

        return score;
    }

}
