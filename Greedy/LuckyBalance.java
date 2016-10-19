import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class LuckyBalance {
	
	public static void main(String arg[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt(), sum = 0;
		PriorityQueue<Contest> contests = new PriorityQueue<>(Collections.reverseOrder());
		Contest[] contestArr = new Contest[n];
		for(int i = 0 ; i < n; i ++){
			int l = scanner.nextInt(), p = scanner.nextInt();
			contestArr[i] = new Contest(l, p);
			if(contestArr[i].priority == 1){
				contests.add(contestArr[i]);
			}else{
				sum = sum + contestArr[i].luckFactor;
			}
		}
		for(int i = 0 ; i < k; i++){
			if(contests.peek()!=null){
				sum = sum + contests.remove().luckFactor;
			}		
		}
		int size = contests.size();
		for(int i = 0 ; i < size; i++){
			if(contests.peek()!=null){
				sum = sum - contests.remove().luckFactor;
			}		
		}
		System.out.println(sum);
		
	}
	
	
	public static class Contest implements Comparable<Contest>{
		
		int luckFactor;
		int priority;
		public Contest(int luckFactor, int priority){
			this.luckFactor = luckFactor;
			this.priority = priority;
		}
		@Override
		public int compareTo(Contest o) {
			return Integer.compare(this.luckFactor, o.luckFactor);
		}
	}

}
