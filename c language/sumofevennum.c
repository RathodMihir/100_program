#include<stdio.h>
void main(){
    int  n,sum=0,arr[100],i;
    printf("Enter a Size: ");
    scanf("%d",&n);

    printf("Enter a %d number: ",n);
    
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    for(i=0;i<n;i++){
        if(arr[i] % 2 == 0){
            sum = sum + arr[i];
        }
    }

    printf("sum of even num is: %d",sum);
}
