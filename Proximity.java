//Gravino, Andrew
//CS1400
//Assignment 3
//3-1-21

import java.util.Scanner;
public class TaskC{
    public static void main(String[] args){
        //Initialize
        int position;

        //Scanner onject
        Scanner keyboard = new Scanner(System.in);

        //Request
        System.out.print("Enter a number. ");
        position = keyboard.nextInt();

        //Switch
        switch(position){
            case 1:
                System.out.println("You won!");
                break;
            case 2:
            case 3:
                System.out.println("You were so close!");
                break;
            default:
                System.out.println("Time to train harder!");
        }
    }
}
