import java.util.Scanner;

public class SherlockAndTheBeast {
	
	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0 ; i < n ; i++){
			int num = scanner.nextInt();
			getDecentNumber(num);
		}
	}
	
	public static void getDecentNumber(int n){
		int n5 = 0;
		int n3 = 0;
		boolean isNone;
		for(int i = 0 ; i <= n; i++){
			n5 = n - i;
			n3 = i;
			//System.out.println(n5 + " " + n3);
			if(n5 %  3 ==0 && n5!=0 && n3==0){
				getNumber(n5, n);
				return;
			} else if((n5 % 3 == 0 && n5!=0) && (n3 % 5 ==0 && n3!=0)){
				getNumber(n5, n);
				return;
			} else if(n3 %5 ==0 && n3 !=0 && n5 ==0){
				getNumber(n5, n);
				return;
			}
		}
		System.out.println("-1");
		
	}
	
	public static String getNumber(int n5, int n){
		String num = "";
		for(int j = 0; j < n; j++){
			
			if(j <n5){
				System.out.print("5");
			}else{
				System.out.print("3");
			}
			
		}
		System.out.println("");
		return num;
	}
	

}
