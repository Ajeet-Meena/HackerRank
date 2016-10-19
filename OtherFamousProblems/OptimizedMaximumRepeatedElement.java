
public class Main {
	
	public static void main(String[] arg){
		int[] n = {1,4,2,2,6,2,5,5,6};
		for(int i = 0;i < n.length; i++){
			System.out.print(n[i]+" ");
		}
		System.out.println(getMaxRepeatedElement(n)); 
		for(int i = 0;i < n.length; i++){
			System.out.print(n[i]+" ");
		}
	}
	
	public static int getMaxRepeatedElement(int[] n){
		int max = getMaxElement(n)+1;
		int number = max;
		for(int i = 0 ; i < n.length; i++){
			n[n[i]%max]  = n[n[i]%max]+ max;
			printArray(n);
		}
		int current , index = 0;
		max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n.length; i++){
			current = n[i];
			if(current > max){
				max = current;
				index = i;
			}
		}
		for(int i = 0; i< n.length; i++){
			n[i] = n[i]/number;
		}
		
		return index;
	}
	
	public static int getMaxElement(int[] n){
		int current, max = Integer.MIN_VALUE;
		for(int i=0; i <n.length; i++){
			current = n[i];
			if(current>max){
				max = current;
			}
		}
		return max;
	}
	
	public static void printArray(int[] arr){
		System.out.println("");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
