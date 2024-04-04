import java.util.Scanner;
import java.util.Stack;
public class Another_practice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String str = null;
        boolean finish = false;
        
        while(!finish) {
        	System.out.print("Input parenthesis: ");
            str = in.nextLine();
        	finish = checkInput(str);
        }
        char[] chr = str.toCharArray();
        
        for(int i = 0; i < chr.length;i++) {
        	stack.push(chr[i]);
        }
        boolean yes = balance(stack);
        if(yes == true) {
        	System.out.println("issa balance gudchit");
        }
        else {
        	System.out.println("haiyaa no symmetry u cancelled");
        }      
	}
	
	static boolean checkInput(String str) {
		boolean truth = false;
		for(int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) != '(' && str.charAt(i) != ')' ) {
				
				System.out.println("repeat input bruv u stopid");
				
				break;
				
			}else {
				System.out.println("you good to go homie");
				truth = true;
				break;
				
			}	
		}
		return truth;	
	}
	static boolean balance(Stack<Character> stack) {
		boolean bal = false;
		int count1 = 0;
		int count2 = 0;
		int num = stack.size();
		for(int i = 0; i < num;i++) {
			char check = stack.pop();
			if(check == '(') {
				count1++; 	
			}
			else {
				count2++;
			}
		}
		
		if(count1 == count2) {
			bal = true;
		}
		return bal;
	}
}
