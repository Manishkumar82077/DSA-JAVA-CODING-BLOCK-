class Upper_bound_and_Lower_bound{
    public static void main(String[] args) {
        int[] array={1,2,2,2,2,2,3,4,5,6,7};
        System.out.println(lower_bound(array,2));
        System.out.println(upper_bound(array,2));
//        System.out.println(Loweer_bound(array,3);
    }

    private static int upper_bound(int[] array, int i) {
        int low=0;
        int last=array.length-1;
        int ans=-1;
        while (low<=last){
            int mid=low+(last-low)/2;
            if(array[mid]==i){
                ans=mid;
                low = mid+1;
            }
            else if(array[mid]>i){
                low=mid+1;
            }
            else {
                last=mid-1;
            }
        }
        return ans;
    }


    static int lower_bound(int[] array, int i) {
        int low=0;
        int last=array.length-1;
        int ans=-1;
        while (low<=last){
            int mid=low+(last-low)/2;
            if(array[mid]==i){
                ans=mid;
                last=mid-1;
            }
            else if(array[mid]>i){
                low=mid+1;
            }
            else {
                last=mid-1;
            }
        }
        return ans;
    }
}