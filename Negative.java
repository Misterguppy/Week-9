/**Emet Park
 * 4/10/24
 * Negative.java
 */

public class Negative {
    public static void main(String[]args){
        int sum = 0;
        int num1 = (int)(7*(Math.random() -3));
        System.out.println(num1);
        int num2 = (int)(7*(Math.random() -3));
        System.out.println(num2);
        int num3 = (int)(7*(Math.random() -3));
        System.out.println(num3);
        int num4 = (int)(7*(Math.random() -3));
        System.out.println(num4);
        sum = (int)num1+(int)num2+(int)num3+(int)num4;
        System.out.println(sum);
        if( sum<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Not Negative");
        }
    }
}