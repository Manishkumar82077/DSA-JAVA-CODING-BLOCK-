import java.util.Arrays;
import java.util.Scanner;
class Array_dsa_coding_block_first_question{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no = sc.nextInt();
        int[] arr=new int[no];
        for (int i=0;i< arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}