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
    for(i=1;i<=n-1;i++){
        k=arr[i];
        j=i;
        while(arr[j-1]>k &&j>=1){
            arr[j]=arr[j-1];
            j--;

        }
        arr[j]=k;
    }
    for( i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}
