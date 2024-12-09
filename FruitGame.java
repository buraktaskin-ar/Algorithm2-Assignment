/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

 

import java.util.Scanner;


public class FruitGame {
    public  static void  printFruit(int number){
        if (number==0){
            System.out.println("[Çilek] ");
        }
        else if (number==1){
            System.out.println("[Portakal] ");
        }
        else if (number==2){
            System.out.println("[Elma] ");
        }
        else if (number==3){
            System.out.println("[Muz] ");
        }
        else if (number==4){
            System.out.println("[Kiraz] ");
        }
        else{
            System.out.println("[Kavun]");
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money ;
        int min = 0; // Minimum value of range
        int max = 5; // Maximum value of range
        int range = max - min + 1;
        boolean gameOn = true;
        int totalGain = 0;
        int totalSpentMoney = 0;

        while (gameOn){

            System.out.print("Enter the amount of money you want to play: ");
            money = input.nextInt();
            totalSpentMoney += money;

            int randomNum =  (int) Math.floor(Math.random()  * range + min);
            int randomNum1 =  (int) Math.floor(Math.random()  * range + min);
            int randomNum2 =  (int) Math.floor(Math.random()  * range + min);

            if((randomNum == randomNum1) && (randomNum==randomNum2)){
                int prizeMoney = money*3;
                totalGain += prizeMoney;
                printFruit(randomNum);
                printFruit(randomNum1);
                printFruit(randomNum2);
            }

            else if (randomNum == randomNum1 ||randomNum == randomNum2 || randomNum1 == randomNum2) {
                int prizeMoney = money * 2;
                totalGain += prizeMoney;
                printFruit(randomNum);
                printFruit(randomNum1);
                printFruit(randomNum2);
            }

            else {
                int prizeMoney = money * 0;
                totalGain += prizeMoney;
                printFruit(randomNum);
                printFruit(randomNum1);
                printFruit(randomNum2);
            }

            Scanner input2 = new Scanner(System.in);
            System.out.print("Do you want to play again?");
            String noOrYes = input2.next();
            if (noOrYes.equals("Y") || noOrYes.equals("y")){
                gameOn = true;
            }
            else {
                gameOn = false;
                System.out.println("Amount of money played: "+ totalSpentMoney);
                System.out.println("The total prize money:"+totalGain);
                System.out.println("Total profit or loss:"+(totalGain-totalSpentMoney));
            }
        }
    }
}




    

