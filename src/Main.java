/* Write a program to Swap two Variables a and b (Swapping basically means interchanging)
Example:-
Input
a=3 , b=4
Output
a=4, b=3
*/

import java.util.*;
public class Main {
    public static void Swap(int a, int b) {
        a = a + b; //5 + 4 = 9
        b = a - b; // 9 - 5 = 4
        a = a - b; // 9 - 4 = 5

        System.out.println("value of a " + a);
        System.out.println("value of b " + b);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();
        Swap(a, b);
    }
}