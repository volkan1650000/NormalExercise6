package Exercises;

import java.util.Scanner;

//Multiplication table based on the input from the user

public class Third{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int length = String.valueOf(x*x).length();

        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=x; j++){
                int lengthIt = String.valueOf(j*i).length();
                System.out.print(i*j);
                for(int k = lengthIt; k<=length; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
