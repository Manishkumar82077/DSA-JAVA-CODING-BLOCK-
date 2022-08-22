class Upper_bound_and_Lower_bound{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        System.out.println(Upper_bound(array,3));
//        System.out.println(Loweer_bound(array,3);
    }

    static int Upper_bound(int[] array, int i) {
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