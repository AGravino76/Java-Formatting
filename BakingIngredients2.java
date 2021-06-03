import java.util.Scanner;
public class BakingIngredients2
{
    public static void main(String[] args)
    {
        //Initialize counts and divide
        //24 shortbread using 4oz butter
        //2oz sugar
        //6oz flour
        int shortbreadCount;
        double butterCount = 4.0/24.0;
        double sugarCount = 2.0/24.0;
        double flourCount = 6.0/24.0;
        
        //Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Asks for shortbread amount
        System.out.print("How many shortbread do you want to make? ");
        shortbreadCount = keyboard.nextInt();

        //Calculate
        butterCount = butterCount * shortbreadCount;
        sugarCount = sugarCount * shortbreadCount;
        flourCount = flourCount * shortbreadCount;

        //Result
        System.out.printf("Here is how much you need in ounces.\nButter: %7.2f ounces, Sugar: %7.2f ounces, Flour: %7.2f ounces.", butterCount, sugarCount, flourCount);
    }
}