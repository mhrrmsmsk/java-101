public class Main {
    static boolean isPolindrom(String str){
        int i=0;
        int j=str.length()-1;
        if (str.charAt(i) != str.charAt(j)){
            return false;
        }
        j++;
        i--;
        return true;
    }
    static boolean isPolindrom2(String str){
        String reverse="";
        for (int i =str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom2("aaacaaa"));
    }
}