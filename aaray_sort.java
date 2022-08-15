import java.util.Arrays;
import java.util.Scanner;

public class aaray_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        System.out.println(no);
        int[] arr = { 2, 5, 12, 1, 45, 75, 43, 21 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
