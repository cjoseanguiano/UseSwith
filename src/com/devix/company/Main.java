package com.devix.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) {
            switch (i) {
                case 1: {
                    System.out.println("One " + i);
                    break;
                }
                case 2:
                case 3:{
                    System.out.println("Two OR Three " + i);
                }
                default:{
                    System.out.println("Default case " + i);
                }
            }
        }
    }
}
