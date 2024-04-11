/** */
import java.util.*;
import java.lang.Math;
public class BlackJack {
    public static void main(String[] args){
        int num1 = (int) (10*(Math.random()*1));
        int num2 = (int) (10*(Math.random()*1));
        Scanner input = new Scanner(System.in);
        int sum = (int)num1 + (int)num2;
        System.out.println("You have a "+num1+" and a "+num2+" for a total of "+sum);
        System.out.print("Enter a 1 if you want another card or any other number for no card.");
        int op = input.nextInt();
        while(sum <= 21){
            if(op==1){
              int num = (int)(10*(Math.random()*1));
              sum +=num;
              System.out.println("You got a "+num+" for a total of "+sum);
              System.out.print("Enter a 1 if you want another card or any other number for no card.");
              op = input.nextInt();
            }
        input.close();
        System.out.println("You lose!");
        }
    }
}
