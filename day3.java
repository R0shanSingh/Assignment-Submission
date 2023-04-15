/*Write a Java program that takes a user's age as input and determines 
if they are old enough to vote in a national election.*/

import java.util.Scanner;

class day3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are old enough to vote in national election.");
        }
        else{
            System.out.println("You are not old enough to vote in national election.");
        }
    }
}