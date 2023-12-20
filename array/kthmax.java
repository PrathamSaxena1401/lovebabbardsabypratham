import java.util.*;
public class kthmax {
  public static int max(int arr[]){
    int max= arr[0];
    int pos=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
        pos=i;
        
          }
    }

    return pos;
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int n =sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the kth value");
   int k=sc.nextInt();
    int i=1;
    while(i!=k){
      int pos=max(arr);
      arr[pos]=0;
      i++;
    }
    int pos=max(arr);
    System.out.println(arr[pos]);
    
    

    
  }
}
