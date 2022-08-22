import java.util.Arrays;

class Binary_serch_algo{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9};
        Arrays.sort(arr);
        int target =9;
        int ans=binary_serch(arr,target);
        System.out.println(ans);
    }

    private static int binary_serch(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            System.out.println(" ");
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            if(target==arr[mid]) {
                return mid;
            }
        }
        return -1;
    }



}