public class ReversString {
    public static void main (String[]args) {
        String a ="madam";
        String rev = "";
//        for (int i = a.length() - 1; i >= 0; i--) {
//            rev = rev + a.charAt(i);
//        }
        int i= a.length()-1;
        while (i>=0){
            rev=rev+a.charAt(i);
            i--;
        }
        System.out.println("given string is :"+ a);
        System.out.println("reverse string is : "+ rev);
        if(a.equals(rev)){
            System.out.println("given string is palindrom");
        }
        else {
            System.out.println("given string is not palindrom");
        }
    }
}
