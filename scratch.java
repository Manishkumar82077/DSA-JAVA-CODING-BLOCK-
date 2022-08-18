import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String st=sc.next();
            st_to_int(st);

    }

    static void st_to_int(String st) {
        int no=0;
        int sum=0;
        for(int i=0;i<st.length();i++){
            sum= sum * 10 + ((int)st.charAt(i) - 48);
        }
        System.out.println(sum);
    }


}