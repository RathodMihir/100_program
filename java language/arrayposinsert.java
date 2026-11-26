import java.util.Scanner;

public class arrayposinsert {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position:");
        int pos = sc.nextInt();

        System.out.println("Enter element:");
        int element = sc.nextInt();

        for(int i=n;i>=pos;i--){
            arr[i] = arr[i-1];

        }
        arr[pos -1] = element;
        n++;

        System.out.println("New Array:");
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
