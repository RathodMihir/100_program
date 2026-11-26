import java.util.Scanner;
public class deletefromarray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[100];

    System.out.println("Enter a Size:");
    int n = sc.nextInt();

    System.out.println("Enter a Element: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter a delete element: ");
    int num = sc.nextInt();

    int pos = -1;

    for(int i=0;i<n;i++){
        if(arr[i] == num){
            pos = i;
            break;
        }
    }   
    if(pos == -1){
        System.out.println("Element not found");
    }

    else{
        for(int i=pos;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        n--;
        System.out.println("After deletion array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
 }
}
