/* Write a program using only while loops to print all the even numbers from 1 to n
Input
if n = 10
Output
2
4
6
8
10
*/

import java.util.*;
public class Main {
    public static void Even_number(int n){
        int i = 0;
        while(i <= n){
            i = i + 2;
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int n = 25;
        Even_number(n);
    }
}