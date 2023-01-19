public class PalindromeNumber {

    public static void main(String args[]){

        System.out.println(isPalindrome(141));

    }

    public static boolean isPalindrome(int x){

        String notReversed = "", reversed = "";

        notReversed += x;

        for (int i = notReversed.length() -1; i >= 0; i--){
            reversed += notReversed.charAt(i);
        }

        if(notReversed.equals(reversed)){
            return true;
        }else{
            return false;
        }

    }

}
