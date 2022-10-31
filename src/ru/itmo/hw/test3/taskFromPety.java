package ru.itmo.hw.test3;

import java.util.Arrays;

public class taskFromPety {
    public static void main(String[] args) {

        String pangram1 = "The quick brown fox jumps over the lazy dog."; //вот на это должно прийти true
        String pangram2 = "You shall not pass!"; // на это предложение false
       String alphabet = "B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z, A, E, I, O, U, Y";
        String[] alphaberArray = alphabet.split(", ");
        System.out.println(Arrays.toString(alphaberArray)); // проверка как выглядит массив



            int numberLetters = 0; // считает сколько раз совпали буквы

            for (String word : alphaberArray) {
                if (pangram1.toUpperCase().contains(word)) {
                    numberLetters += 1;
                    //return;
                }
            }
            System.out.println(numberLetters); // результат совпадений


            if (numberLetters >= 27) {
                System.out.println("true");
               // return true;
            } else if (numberLetters < 27) {
                System.out.println("falce");
                //return false;
            }
       // return false;
    }
    }

