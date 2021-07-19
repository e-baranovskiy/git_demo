package com.git.example.service;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.println("Переводчик EN -> RU");


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово для перевода: ");
        String word = sc.next();

        switch (word) {
            case "car":
                System.out.println(" -> машина");
                break;
            case "weather":
                System.out.println(" -> погода");
                break;
            case "train":
                System.out.println(" -> поезд");
                break;
            case "rain":
                System.out.println(" -> дождь");
                break;
            case "house":
                System.out.println(" -> дом");
                break;
            case "user":
                System.out.println(" -> пользователь");
                break;
            case "sun":
                System.out.println(" -> солнце");
                break;
            case "heat":
                System.out.println(" -> жара");
            default:
                System.out.println("Попробуйте другое слово");
        }
    }
}
