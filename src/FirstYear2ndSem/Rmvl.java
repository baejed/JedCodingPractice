package FirstYear2ndSem;

import java.util.Scanner;

public class Rmvl {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputs = 0;
        while (inputs != 4) {
            String words = in.nextLine();
            boolean isCoCluster = checkCoCluster(words);
            boolean isVoCluster = checkVoCluster(words);
            if (isCoCluster && isVoCluster) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            inputs++;
        }
    }

    public static boolean checkCoCluster(String words) {
        for (int i = 0; i < words.length() - 1; i++) {
            if (words.charAt(i) == ' ' || words.charAt(i + 1) == ' ') {
                continue;
            }
            if (!isVowel(words.charAt(i)) && !isVowel(words.charAt(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkVoCluster(String words) {
        for (int i = 0; i < words.length() - 1; i++) {
            if (words.charAt(i) == ' ' || words.charAt(i + 1) == ' ') {
                continue;
            }
            if (isVowel(words.charAt(i)) && isVowel(words.charAt(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

}
