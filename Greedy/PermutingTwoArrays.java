import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PermutingTwoArrays {
	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		for(int i = 0 ; i < q; i++){
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for(int j = 0; j < n; j++){
				a[j] = scanner.nextInt();
			}
			for(int j = 0; j < n; j++){
				b[j] = scanner.nextInt();
			}
			if(printYesOrNo(n,k,a,b)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

	private static boolean printYesOrNo(int n, int k, int[] a, int[] b) {
		HashMap<Integer, Integer> hashMap = new HashMap<>(n);
		for(int i = 0; i < n; i++){
			if(hashMap.containsKey(a[i])){
				//System.out.println("Yes" + a[i] );
				hashMap.put(a[i], hashMap.get(a[i])+1);
			}else{
				//System.out.println("No" + a[i] );
				hashMap.put(a[i], 1);
			}
		}
		for(int i = 0 ; i < n; i++){
			if(hashMap.containsKey(k-b[i]) ){
				//System.out.println(b[i] + " " + (k-b[i]) + " " + hashMap.get(k-b[i]) + " test" );
				hashMap.put(k-b[i], hashMap.get(k-b[i])-1);
			}else{
				//System.out.println("Not contain" + (k-b[i]));
				return false;
			}
		}
		return true;
		// TODO Auto-generated method stub
		
	}

}
