import java.util.Scanner;
class CDR_FIND_LAST_ELEMENT{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] array = new int[N];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int M =sc.nextInt();
        System.out.println(cheak(array,M));

    }
    static int cheak(int[] array, int m) {
        for(int i=array.length-1;i>=0;i--){
            if(array[i]==m){
                return i;
            }
        }
        //return -1;
        return m;
    }

}