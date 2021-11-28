import java.util.Scanner;
public class selection {
    public static void main(String[]args){
        int i,j,min,n,k;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int[]arr =new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
    }
    for(i=0;i<n-1;i++){
        min=i;
        for(j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
                k=arr[min];
                arr[min]=arr[i];
                arr[i]=k;
            }
        }
    }
    for(i=0;i<n;i++){
        System.out.println(arr[i] +" ");
    }

    }
    
}
