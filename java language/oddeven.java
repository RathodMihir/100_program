public class oddeven {
    public static void main(String args[]){
        int n=123456;
        int even=0;
        int odd=0;

        while(n>0){
            int digit = n % 10;
            if(digit % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
            n=n/10;
        }
        System.out.println("Total Even Digits = " + even);
        System.out.println("Total Odd Digits = " + odd);
    }
}
