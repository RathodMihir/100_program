import java.util.Scanner;
public class searchingarray {
    public static int IsInArray(int arr[],int m,int i){
        if(i == arr.length){
            return 0;
        }
        if(arr[i] == m){
            return 1;
        }
        return IsInArray(arr,m,i+1);
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter 5 elements:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number to search: ");
        int m = sc.nextInt();

        int result = IsInArray(arr,m,0);

        if(result == 1){
            System.out.println("Element is found.");
        }
        else{
            System.out.println("Element is not found");
        }

    }
    
}
