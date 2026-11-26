import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];

        int r1,c1,r2,c2;

         System.out.println("Enter rows and columns of first matrix:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.println("Enter rows and columns of second matrix:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
        }
        else {

            System.out.println("Enter first matrix elements:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter second matrix elements:");

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
    }
}
