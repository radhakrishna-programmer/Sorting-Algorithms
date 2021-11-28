import java.util.Scanner;
public class bubble{
    public static void main(String[]args){
        int i,j,n,k;
        Scanner input=new Scanner(System.in);
        n= input.nextInt();
        int[]arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                 if(arr[j]>arr[j+1]){
                     k=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=k;
                 }
            }

        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]  +"  ");
            
            
            
        }

    }

}