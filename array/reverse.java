public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        //reversing an array
        int j=size-1;
        for(int i=0;i<size;i++){
                if(i==j){
                    break;
                }
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j--;
             
           
        }
        System.out.println("This is reversed array");
         for(int i=0;i<size;i++){
            System.out.print(arr[i] + " " );
        }
    }
}