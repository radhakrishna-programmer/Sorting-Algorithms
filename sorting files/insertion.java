import java.util.Scanner;
public class insertion {
    public static void main(String[]args){
    int n,j,k,i;
   
    Scanner input= new Scanner(System.in);
    n=input.nextInt();
    int[]arr=new int[n];
    for( i=0;i<n;i++){
        arr[i]=input.nextInt();
    }
    for(i=0;i<n-1;i++){
        for(j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                k=arr[j];
                arr[j]=ar[j-1];
                arr[j-1]=k;
            }
        }
    }
    for( i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}
