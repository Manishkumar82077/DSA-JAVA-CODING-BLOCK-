import java.util.Scanner;
// nth no of fibonachi no
class _U_FIBONACI_NO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(fibonaci_no(no));
    }

    static int fibonaci_no(int no) {
        if(no<2){
            return no;
        }
        return (no-1)+(no-2);


    }
}