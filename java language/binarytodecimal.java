import java.util.Scanner;

public class binarytodecimal {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    int temp = num;
    int i =0;
    int d=0;
    while(temp>0){
        int rem = temp%10;
        temp = temp/10;
        d = d + rem*(int)Math.pow(2,i++);
    }
    System.out.println("decimal of"+num+ " " + "is" + " " +d);
 }   
}
