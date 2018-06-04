package com.company;

import java.util.Random;
public class RandomnessCompletionActivity {

    public static void main(String[] args) {
	// write your code here this all cleaned up
        int dienumber;
        Random rnd = new Random();

        dienumber = 1 + rnd.nextInt(6);

        System.out.println("Your die roll was : " + dienumber);
    }
}
