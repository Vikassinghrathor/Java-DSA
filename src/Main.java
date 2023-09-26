/*Write a program to print the largest number of the two numbers given.
Input:- a=3, b=4
Output: 4
 */

import java.util.*;
public class Main {
    public static void largest(int x, int y){
        if(x > y){
            System.out.println("x is greater");
        }else{
            System.out.println("y is greater");
        }


    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number one");
        int x = input.nextInt();
        System.out.println("Enter the number two");
        int y = input.nextInt();
        largest(x,y);

    }
}