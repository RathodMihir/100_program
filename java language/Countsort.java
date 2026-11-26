public class Countsort {
    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basiccountsort(int[] arr){
        
        int max = findmax(arr);//find the largest element of the array
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++; //Frequency count
        }
            int k = 0;
            for(int i=0;i<count.length;i++){
                for(int j=0;j<count[i];j++){
                    arr[k++] = i;
                }
            }
    }

    static void display(int[] arr){
        for(int val : arr){
            System.out.println(val + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,5,2,2,5};
        basiccountsort(arr);
        display(arr);
    }
}
