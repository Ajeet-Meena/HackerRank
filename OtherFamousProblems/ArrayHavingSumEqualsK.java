import java.util.Arrays;

public class ArraySumProblem {
	
	public static void main(String arg[]){
		int sum = 23;
		int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
		printArray(arr);
		int[] subArray = getSubArray(arr,sum);
		printArray(subArray);
	}
	
	public static int[] getSubArray(int[] arr, int sum){
		int currentSum = arr[0];
		int start = 0, end = 1;
		while(start<=end){
			if(currentSum == sum){
				return Arrays.copyOfRange(arr, start, end);
			} else if(currentSum > sum){
				currentSum = currentSum - arr[start];
				start++;
			}else if(currentSum < sum){
				currentSum = currentSum + arr[end];
				end++;
			}
		}
		return new int[] {-1};
		
	}
	
	public static void printArray(int arr[]){
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

}
