import java.util.*;
public class withoutalgosort012 {
   public static int countt(int arr[],int x){
     int count=0;
     for(int i=0;i<arr.length;i++){
       if(arr[i]==x){
         count++;
       }
     }
     return count;
   }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n =sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int zeros=countt(arr,0);
    int ones=countt(arr,1);
    int twos=countt(arr,2);
   for(int i=0;i<zeros;i++){
     arr[i]=0;
   }
    for(int i=zeros;i<zeros+ones;i++){
       arr[i]=1;
     }
    for(int i=zeros+ones;i<zeros+ones+twos;i++){
       arr[i]=2;
     }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    
    

    
  }
}
