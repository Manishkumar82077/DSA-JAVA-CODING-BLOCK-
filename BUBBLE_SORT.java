import java.util.Arrays;

class BUBBLE_SORT {
    public static void main(String[] args) {
        int[] arr = {22,34,32,21,224,56,7};
        System.out.println(Arrays.toString(arr));
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr) {
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

