
// https://www.geeksforgeeks.org/java-program-to-print-reverse-pyramid-star-pattern/
import java.util.*;

class Solution49 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // Approach 1: Grid Based Approach
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col >= row)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        // Approach 2: Stars & Spaces Approach
        int stars = n, spaces = 0;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                System.out.print("* ");
            }

            System.out.println();
            stars--;
            spaces++;
        }
    }
}
