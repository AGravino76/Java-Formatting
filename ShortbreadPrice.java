//Gravino, Andrew
//CS1400
//Assignment 3
//3-1-21

import java.util.Scanner;
public class TaskA{
    public static void main(String[] args){
        //Initialize counts
        //Each shortbread = 5$
        //Once it reaches a certain threshold, then apply that certain discount
        int packageCount;
        double discount1 = 0.80, discount2 = 0.70, discount3 = 0.60, discount4 = 0.50;
        double price;

        //Scanner object
        Scanner keyboard = new Scanner(System.in);

        //Ask for how many packages they want and then multiply by 5 for base price
        System.out.print("How many packages of shortbread do you want to order? ");
        packageCount = keyboard.nextInt();
        price = packageCount*5;

        //Result
        if(packageCount >= 10 && packageCount <= 19){
            price*=discount1;
            System.out.printf("For your order of " + packageCount + " 1shortbread, you will be getting a dicount of 20 percent. Your total is $%.2f", price);
        }
        else if(packageCount >= 20 && packageCount <= 49){
            price*=discount2;
            System.out.printf("For your order of " + packageCount + " shortbread, you will be getting a dicount of 30 percent. Your total is $%.2f", price);
        }
        else if(packageCount >= 50 && packageCount <= 99){
            price*=discount3;
            System.out.printf("For your order of " + packageCount + " shortbread, you will be getting a dicount of 40 percent. Your total is $%.2f", price);
        }
        else if(packageCount >= 100){
            price*=discount4;
            System.out.printf("For your order of " + packageCount + " shortbread, you will be getting a dicount of 50 percent. Your total is $%.2f", price);
        }
        else{
            System.out.printf("For your order of " + packageCount + " shortbread, you will be getting no discount. Your total is $%.2f", price);
        }
    }
}