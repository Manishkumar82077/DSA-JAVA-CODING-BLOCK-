public class stringbuilder {

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            st.append(ch);
        }
        System.out.println(st.toString());
        System.out.println();
    }
}
