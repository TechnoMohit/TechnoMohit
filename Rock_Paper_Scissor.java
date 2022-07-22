package com.mohitjava;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor{
    public static void main(String[] args) {
        Random rand= new Random();
        int cNum= rand.nextInt(3)+1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the rock paper and scissors game developed by Techno Mohit !!\nPress one selecting Rock\n" +
                "press two for selecting Paper\npress three for selecting Scissor");
        int select= sc.nextInt();

        switch (select){
            case 1:
                switch (cNum){
                    case 1:
                        System.out.println("Computer selected 1(Rock)!!\n\nThis is Draw!!");
                        break;
                    case 2:
                        System.out.println("Computer selected 2(Paper)!!\n\nComputer Won!!");;
                        break;
                    case 3:
                        System.out.println("Computer selected 3(Scissor)!!\n\nYou Won!!");
                        break;
                }
                break;
            case 2:
                switch (cNum){
                    case 1:
                        System.out.println("Computer selected 1(Rock)!!\n\nYou Won!!");
                        break;
                    case 2:
                        System.out.println("Computer selected 2(Paper)!!\n\nThis is Draw!!");;
                        break;
                    case 3:
                        System.out.println("Computer selected 3(Scissor)!!\n\nComputer won!!");
                        break;
                }
                break;
            case 3:
                switch (cNum){
                    case 1:
                        System.out.println("Computer selected 1(Rock)!!\n\nComputer Won!!");
                        break;
                    case 2:
                        System.out.println("Computer selected 2(Paper)!!\n\nYou Won!!");;
                        break;
                    case 3:
                        System.out.println("Computer selected 3(Scissor)!!\n\nThis is Draw!!");
                        break;
                }
                break;
            default:
                System.out.println("Enter a Correct value!!");
                break;
        }
    }
}
