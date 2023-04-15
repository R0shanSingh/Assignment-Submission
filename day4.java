/*Create a program that uses a loop to display the multiplication table 
for a number entered by the user.*/

import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get it's multiplication table: ");
        int num = sc.nextInt();
        int i=1;
        System.out.println("\nMULTIPLICATION TABLE OF "+num+" :-");
        while(i<=10){
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }
    }
}
