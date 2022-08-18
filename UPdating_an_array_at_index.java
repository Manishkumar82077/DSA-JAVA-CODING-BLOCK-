import java.util.Arrays;
import java.util.Scanner;
class UPdating_an_array_at_index {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("no of element in aaaray : ");
        int no=sc.nextInt();
        int[] arr = new int[no];
        for(int x:arr){
          x= sc.nextInt();
        }
        System.out.println("index: ");
        int update_index=sc.nextInt();
        System.out.println("number :");
        int update_number=sc.nextInt();
        Update_array_at_index(arr,update_number,update_index);
        System.out.println( Arrays.toString(arr));
        }

     static void Update_array_at_index(int[] arr, int update_number, int update_index) {
    for(int i=0;i< arr.length-1;i++){
        if(i==update_index){
            arr[update_index]=update_number;
        }
    }


}
}