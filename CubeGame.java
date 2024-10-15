/*
Author name: Vignesh Sudhan Valvaikar
Roll no: 53
Title: Guess the Cube
Start Date: 20/08/2024
Description: This game is developed by me for an evaluation in my Course. whose aims is to implement a simple guess the cube game in virtual life.
 */
import java.util.*;

public class CubeGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int Cubeposition = random.nextInt(3) + 1;

        System.out.println("Welcome to My Cube Game!");
        System.out.println("There are 3 cups present in front.");
        System.out.print("Indicate which of the three cups is capable of holding the cube.");
        displayCups(Cubeposition, 0);

        while (true) {
            System.out.print("Select one of the following cup show whether the cube is present (1, 2), or (3) ?\n");
            int Choice = sc.nextInt();
            if (Choice < 1 || Choice > 3) {
                System.out.println("Invalid choice. Re-Enter your choice (1 and 3)");
                continue;
            }
            if (Choice == Cubeposition) {
                System.out.println("Congratulations! You guessed correctly. The cube was under cup " + Choice + ".");
                displayCups(Cubeposition, Choice);
                break;
            } else {
                System.out.println("No. The cube was not under cup " + Choice + ".");

                int computerChoice = random.nextInt(3) + 1;
                if (computerChoice == Cubeposition) {
                    System.out.println("Computer guessed correctly! The cube was under cup " + computerChoice + ".");
                    System.out.println("You lose. Better luck next time!");
                } else {
                    System.out.println("Computer guessed cup " + computerChoice + ", but it was wrong.");
                }
                displayCups(Cubeposition, Choice);
                break;
            }
        }

        sc.close();
    }
    private static void displayCups(int cubePosition, int userChoice) {
        System.out.println("Cup 1  Cup 2  Cup 3");
        for (int i = 1; i <=3; i++) {
            if (i == userChoice) {
                System.out.print("[ " + (i == cubePosition ? "X" : "O") + " ]  ");
            } else {
                System.out.print("[   ]  ");
            }
        }
        System.out.println();
    }
}