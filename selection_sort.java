import java.util.Arrays;

class selection_sort {
    public static void main(String[] args) {
        int[] arr ={4,3,6,8,2};
        System.out.println(Arrays.toString(arr));
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

   static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
}