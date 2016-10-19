import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
        int i = 0, j = 0;
		for(i = 0 ; i < t ; i++){
			boolean isLexo = true;
			int n = scanner.nextInt();
			String prev = null;
			String arr[] = new String[n];
			for(j = 0; j < n ; j++){
				arr[j] = scanner.next();
				char[] charArr = arr[j].toCharArray();
				Arrays.sort(charArr);
				arr[j] = new String(charArr);
				System.out.println(arr[j]);
				if(prev!=null && prev.compareTo(arr[j])>=1){
					isLexo = false;
				}
				prev = arr[j];
			}
			if(isLexo) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
