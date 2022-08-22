import java.util.Arrays;

class selection_sort {
    public static void main(String[] args) {
        int[] arr ={4,3,6,8,2};
        System.out.println(Arrays.toString(arr));
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
                int min = 0;
            for(int j = i+1; j < (arr.length-1 ); j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

}