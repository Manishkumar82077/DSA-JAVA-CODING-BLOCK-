class PRINT_TILL{
    public static void main(String[] args) {
        int x=5;
        print(x);
    }

    private static void print(int x) {
        System.out.println(x);
        if(x==1){

        }else{
            print(x-1);
        }
    }
}