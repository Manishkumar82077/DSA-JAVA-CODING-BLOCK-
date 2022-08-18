import java.util.Arrays;
import java.util.Scanner;
class dsa_worksheet_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[100];
        arr = {54, 2, 45, 67, 89, 54, 756, 32, 11};

        System.out.println("1.adding element at the end position of array ");
        System.out.println("2.adding a element at given position ");
        System.out.println("3.detating a element in array");
        System.out.println("4.printing the aaray ");
        int no = sc.nextInt();
        switch (no) {
            case :1
                System.out.println("adding element at the end position of array ");
                int number = sc.nextInt();
                addelement_end(arr, arr.length - 1, number);
                break;

            case : 2
                System.out.println("adding a element at given position ");
                int update_index = sc.nextInt();
                int number = sc.nextInt();
                addelement_end(arr, update_index, number);
                break;

            case : 3
                System.out.println("detating a element in array");
                System.out.println("");
                int delate_index = sc.nextInt();
                delate(arr, delate_index);
                break;

            case :4
                System.out.println("printing the aaray : ");
                System.out.println(Arrays.toString(arr));
                break;

        }
//
    }

    static void addelement_end(int[] arr, int i, int number) {
        for(int i=0,i<arr.length-1,i++){
            if()
        }
    }
}