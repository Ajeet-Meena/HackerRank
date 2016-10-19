public class PascalTriangle {
	public static void main(String[] arg){
		int n = 5;
		printPascal(n);
	}
	
	public static void printPascal(int n){
		String gap = "";
		for(int i=0 ; i < n; i++){
			gap = gap+" ";
		}
		int[] current = new int[n], prev = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print(gap.substring(0, n-i));
			for(int j = 0; j<=i; j++){
				if(j == 0 || j == i ){
					prev[j] = 1;
					current[j] = 1;
					System.out.print(prev[j]+ " ");
				}else{
					current[j] = prev[j] + prev[j-1];
					System.out.print( current[j]+ " ");
				}
			}
			prev = current;
			current = new int[n];
			System.out.println("");
		}
	}
}
