import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JimAndTheOrders {
		public static void main(String[] arg){
			Scanner scanner =new Scanner(System.in);
			int n = scanner.nextInt();
			ArrayList<Order> arrayList = new ArrayList<>(n);
			for(int i = 0 ; i < n; i++){
				int t = scanner.nextInt();
				int d = scanner.nextInt();
				arrayList.add(new Order(t+d,i));
			}
			Collections.sort(arrayList);
			for(int i = 0 ; i <n; i++){
				if(i !=n-1){
					System.out.print((arrayList.get(i).position+1)+ " ");
				}else{
					System.out.print((arrayList.get(i).position+1));
				}
			
			}
		}
		
		public static class Order implements Comparable<Order>{
			int totalTime;
			int position;
			
			public Order(int totalTime, int position){
				this.totalTime = totalTime;
				this.position = position;
			}

			@Override
			public int compareTo(Order o) {
				if(this.totalTime > o.totalTime){
					return 1;
				}else if(this.totalTime < o.totalTime){
					return -1;
				}else{
					if(this.position > o.position){
						return 1;
					}else{
						return -1;
					}
				}
			}
	
			
		}
}
