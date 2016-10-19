import java.util.Scanner;

public class TheMaximumSubArray {
	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		dpProgram2();
	}

	public static void dpProgram2() {
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int l = scanner.nextInt();
			int arr[] = new int[l];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scanner.nextInt();
			}
			System.out.println(findCont(arr) + " " + findNonCont(arr));
		}
	}

	private static long findNonCont(int[] arr) {
		boolean isAllNegative = true;
		int leastNegative = Integer.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				isAllNegative = false;
				sum = sum + arr[i];
			} else {
				if (arr[i] > leastNegative) {
					leastNegative = arr[i];
				}
			}
		}
		if (isAllNegative) {
			return leastNegative;
		} else {
			return sum;
		}
	}

	private static long findCont(int[] arr) {
		int max_so_far = arr[0];
		int curr_max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			curr_max = max(arr[i], curr_max + arr[i]);
			max_so_far = max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}
}
