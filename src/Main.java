import java.util.*;
/* Given the Day number, print the Day name in lower case corresponding to it by using the help of switch statement.

Note: Day 1 - is monday.

If the day is not valid example 1> day >7 then print invalid

Input :-

Day - 3

Output :-

wednesday

*/

public class Main {
    public static void weekday_name(int n) {
        switch(n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        weekday_name(a);
    }
}
