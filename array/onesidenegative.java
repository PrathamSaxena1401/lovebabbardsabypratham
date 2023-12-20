import java.util.*;
public class onesidenegative {
   
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n =sc.nextInt();
    int [] arr=new int[n];
    


    
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
   for(int i=0;i<n;i++){
     for(int j=i;j<n;j++){
       if(arr[j]<0){
         int temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
       }
     }
   }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    }
  }

