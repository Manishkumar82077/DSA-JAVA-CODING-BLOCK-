class Leetcode_penindrom_question{
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean yes=isPalindrome(s);
        System.out.println(yes);
    }
    static String inputValidator(String[] s) {
        for(int i = 0; i < s.length; i++) {
            s[i].replaceAll("[^a-zA-Z]", "");
            s[i].toLowerCase();
        }
        return s;
    }
    public static boolean isPalindrome(String[] s) {
        String st =inputValidator(s);
        char ch[]=st.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        if(rev.equals(st)){
            return true;
        }
        return false;
    }


}