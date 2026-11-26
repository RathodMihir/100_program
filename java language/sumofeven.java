
class sumofeven {
    public static void main(String[] args) {

        int a[] = {10, 15, 20, 25, 30};
        int sum = 0;

        for(int i = 0; i < 5; i++) {

            if(a[i] % 2 == 0) {
                sum = sum + a[i];
            }
        }

        System.out.println("Sum of Even Numbers = " + sum);
    }
}
