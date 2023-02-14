package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT=new Scanner(System.in);
        String userInput="";

        while (true){
            System.out.println("1. Customer 2. Employee 3. Quit");
            userInput=INPUT.nextLine();

            if(userInput.equalsIgnoreCase("1")||userInput.equalsIgnoreCase("1.")||userInput.equalsIgnoreCase("Customer")){

            }
            else if(userInput.equalsIgnoreCase("2")||userInput.equalsIgnoreCase("2.")||userInput.equalsIgnoreCase("Employee")){

            }
            else if (userInput.equalsIgnoreCase("3")||userInput.equalsIgnoreCase("3.")||userInput.equalsIgnoreCase("Quit")){
                break;
            }
            else{
                System.out.println("The program can not understand "+userInput);
            }
        }

    }
}
