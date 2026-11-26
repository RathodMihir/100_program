import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter how many number: ");
        int n = sc.nextInt();
        
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int max = num;
        int min = num;
        int sum = num;

        for(int i=2;i<=n;i++){
            System.out.println("Enter a number: ");
            num = sc.nextInt();

            if(num > max){
                max = num;
            }

            if(num < min){
                min = num;
            }
            sum = sum + num;
        }
          double avg = (double) sum / n;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);
    }   
}
