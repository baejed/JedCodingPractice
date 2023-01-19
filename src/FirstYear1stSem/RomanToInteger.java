import java.util.Scanner;

public class RomanToInteger {

    public static void main(String args[]){

        Scanner scanf = new Scanner(System.in);

        String romanNum;

        int conversion;



        System.out.print("Enter roman numeral: ");
        romanNum = scanf.nextLine();

        romanNum = romanNum.toUpperCase();

        conversion = romanToInt(romanNum);

        System.out.printf("\n%s is equal to %d", romanNum, conversion);

    }

    public static int romanToInt(String romanString){

        char[] romanArray;

        int romanConversion = 0;


        int romanLength;

        romanLength = romanString.length();
        romanArray = romanString.toCharArray();

        for(int i = 0; i < romanLength; i++){

            int j = i;

            switch(romanArray[i]){

                case 'I':

                    if(i < romanLength - 1){

                        j++;

                        if (romanArray[j] == 'V' || romanArray[j] == 'X'){

                            romanConversion -= 1;

                        }else{

                            romanConversion += 1;

                        }

                    }else{

                        romanConversion += 1;

                    }

                    break;

                case 'V':

                        romanConversion += 5;

                    break;

                case 'X':

                    if(i < romanLength - 1){

                        j++;

                        if (romanArray[j] == 'L' || romanArray[j] == 'C'){

                            romanConversion -= 10;

                        }else{

                            romanConversion += 10;

                        }

                    }else{

                        romanConversion += 10;

                    }

                    break;

                case 'L':

                        romanConversion += 50;

                    break;

                case 'C':

                    if(i < romanLength - 1){

                        j++;

                        if (romanArray[j] == 'D' || romanArray[j] == 'M'){

                            romanConversion -= 100;

                        }else{

                            romanConversion += 100;

                        }

                    }else{

                        romanConversion += 100;

                    }

                    break;

                case 'D':

                        romanConversion += 500;

                    break;

                case'M':

                        romanConversion += 1000;

                    break;

            }



        }

        return romanConversion;

    }

}
