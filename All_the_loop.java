import java.util.Scanner;
class All_the_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner((System.in));
        int no =sc.nextInt();
        int[] arr = new int[no];
        int i=0;
        while(i<no){
            arr[i]= sc.nextInt();
            i++;
        }
        System.out.println("print array using do while :");
        int k=0;
        do {
            System.out.print(arr[k]+" ");

            k++;
        }while (k< arr.length);
        System.out.println(" ");
        System.out.println("print array using for loop :");
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }

    }
}