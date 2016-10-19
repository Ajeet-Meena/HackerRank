import java.io.Reader;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
		public static void main(String args[]){
			Scanner scanner = new Scanner(System.in);
			String inputString = scanner.next();
			System.out.println(isBalancedParenthesis(inputString));
		}
		
		public static boolean isBalancedParenthesis(String inputString){
			Stack<Character> stack = new Stack<>();
			for(int i = 0 ; i < inputString.length() ; i++) {
				char c = inputString.charAt(i);
				if(isOpenParenthesis(c)) {
					stack.push(c);
					continue;
				}
				else if(isCloseParenthesis(c)) {
					if(isSameParenthesis(stack.peek(),c)){
						stack.pop();
					} else {
						return false;
					}
				}
			}
				return stack.isEmpty();
		}
		
		public static boolean isSameParenthesis(char a, char b){
			switch(a){
			case '(' : {
				return b == ')';
			}
			case '{': {
				return b == '}';
			}
			case '[': {
				return b == ']'; 
			}
			}
			return false;
		}
			
		
		public static boolean isOpenParenthesis(char c){
			return c == '(' || c == '{' || c == '[';
		}
		
		public static boolean isCloseParenthesis(char c){
			return c == ')' || c == '}' || c == ']';
		}
}
