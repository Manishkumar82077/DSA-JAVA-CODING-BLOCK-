import java.util.Arrays;

class Refrance_swap{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] nums ={5,6,7,8,9,0};
        System.out.println("when we intiallize array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
        other(arr,nums);
        System.out.println("when we print  array after swap pop up off of stack: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }

    static void other(int[] arr, int[] nums) {
        int[] temp=arr;
        arr=nums;
        nums=temp;
        System.out.println("when we print  array in swap method: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
}