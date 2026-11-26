// import java.util.Scanner;

// public class armstrong_11 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num = sc.nextInt();
//         int temp = num;
//         int d = 0;
//         while(temp > 0){
//            int  rem = temp % 10;
//             d = d + (rem * rem * rem);
//             temp  = temp / 10;
           
//         }
//         if(d == num ){
//         System.out.println("armstrong num is: "+d);
//     }
//     else{
//         System.out.print("not armstrong");
        
//         }
//     }
    
// }



import java.util.Scanner;

public class armstrong_11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        int d = 0;

        int t = num;

        while (t > 0) {
            count++;
            t = t / 10;
        }

        temp = num;

        while (temp > 0) {
            int rem = temp % 10;

            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * rem;
            }

            d = d + power;
            temp = temp / 10;
        }

        if (d == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
