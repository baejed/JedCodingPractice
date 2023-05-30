package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public static void main(String[] args) {

        System.out.println(convert("PAYPALISHIRING", 4));

    }

    public static String convert(String s, int numRows) {

        List<List<Character>> zigzag = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int currentRow = 0;
        int currentIndex = 0;

        for(int i = 0; i < numRows; i++){
            zigzag.add(new ArrayList<>());
        }

        while (currentIndex < s.length()) {
            int i = 0;

            for(; i < numRows && currentIndex < s.length(); i++, currentIndex++){
                zigzag.get(i).add(s.charAt(currentIndex));
            }

            currentRow++;
            i = numRows - 2;

            for(; i > 0 && currentIndex < s.length(); i--, currentIndex++){
                zigzag.get(i).add(s.charAt(currentIndex));
            }

        }

        for(int i = 0; i < zigzag.size(); i++){
            System.out.println(zigzag.get(i));
            for (int j = 0; j < zigzag.get(i).size(); j++){
                builder.append(zigzag.get(i).get(j));
            }
        }

        return builder.toString();

    }

}
