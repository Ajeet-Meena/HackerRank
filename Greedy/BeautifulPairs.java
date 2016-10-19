import java.util.Arrays;
import java.util.Scanner;

public class BeautifulPairs {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer a[] = new Integer[n], b[] =new Integer[n];
		for(int i = 0 ; i < n; i++){
			a[i] = scanner.nextInt();
		}
		for(int i =0; i< n; i++){
			b[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		/*for(int i = 0 ; i < n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(int i =0; i< n; i++){
			System.out.print(b[i]+" ");
		}*/
		int i = 0, j =0, count = 0;
		boolean hasChange = false;
		while(i<n && j<n){
			if(a[i] == b[j]){
				i++;
				j++;
				System.out.print(b[i]+" ");
				count++;
			}else{
				hasChange = true;
				if(a[i]<b[j]){
					i++;
				}else{
					j++;
				}
			}
		}
		System.out.println("");
		if(hasChange){
			System.out.println(count + 1);
		}else{
			System.out.println(count);

		}
	}
}
