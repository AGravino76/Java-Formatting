//Gravino, Andrew
//CS1400
//Assignment 3
//3-1-21

import java.util.Scanner;
public class TaskB{
    public static void main(String[] args){
        //Initialize strings and counts
        //Do something like "if time1 does something, then display name1"
        //It's gonna be comparing the times first and then make a respective String result in the end
        int time1, time2, time3;
        String person1, person2, person3;

        //Scanner object
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);

        //Ask for their name and then their times
        System.out.print("What is the first person's name? \n");
        person1 = keyboard1.nextLine();
        System.out.printf("What time did %s get? \n", person1);
        time1 = keyboard1.nextInt();

        System.out.print("What is the second person's name? \n");
        person2 = keyboard2.nextLine();
        System.out.printf("What time did %s get? \n", person2);
        time2 = keyboard2.nextInt();

        System.out.print("What is the the third person's name? \n");
        person3 = keyboard3.nextLine();
        System.out.printf("What time did %s get? \n", person3);
        time3 = keyboard3.nextInt();

        //Comparisons
        //1,2,3
        if(time1 < time2 && time1 < time3 && time2 < time3){
            System.out.printf("First place is %s, second place is %s, and third place is %s.", person1, person2, person3);
        }
        //1,3,2
        else if(time1 < time2 && time1 < time3 && time3 < time2){
            System.out.printf("First place is %s, second place is %s, and third place is %s.", person1, person3, person2);
        }   
        //2,1,3
        else if(time2 < time1 && time2 < time3 && time1 < time3){
            System.out.printf("First place is %s, second place is %s, and third place is %s.", person2, person1, person3);
        }
        //2,3,1
        else if(time2 < time1 && time2 < time3 && time3 < time1){
            System.out.printf("First place is %s, second place is %s, and third place is %s.", person2, person3, person1);
        }
        //3,1,2
        else if(time3 < time1 && time3 < time2 && time1 < time2){
            System.out.printf("First place is %s, second place is %s, and third place is %s.", person3, person1, person2);
        }
        //3,2,1
        else if(time3 < time1 && time3 < time2 && time2 < time1){
            System.out.printf("First place is %s, second place is %s, and third place is %s.", person3, person2, person1);
        }
    }
}