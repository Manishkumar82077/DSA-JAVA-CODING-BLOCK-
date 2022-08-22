import java.util.Arrays;
import java.util.Scanner;

class Bianry_serch_taking_input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in array : ");
        int no = sc.nextInt();
        int[]  arr = new int[no];
        System.out.println("Enter the array element : ");
        for(int x=0;x< arr.length;x++){
            arr[x]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element : ");
        int target= sc.nextInt();
        int ans=binary_find(arr,target);
        System.out.println(ans);

    }

      public static int  binary_find(int[] arr, int target) {
          int start = 0;
          int end = arr.length - 1;
          while (start <= end) {
              int mid = (start + end) / 2;
              System.out.println(" ");
              if (target < arr[mid]) {
                  end = mid - 1;
              } else if (target > arr[mid]) {
                  start = mid + 1;
              }
              if (target == arr[mid]) {
                  return mid;
              }
          }
          return -1;
      }
}

