import java.util.Iterator;
import java.util.LinkedList;

public class ShiftArray {
	public static void main(String arg[]) {
		String stream = "abcdef";
	}

	public static void printArray(int[] arr) {
		System.out.println("\nPrintArray");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	public static int[] shiftArray(int[] arr, int shiftBy) {
		for (int i = 0; i < shiftBy; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = temp;
		}
		return arr;
	}

	public static int[] shiftArrayUsingLinkedList(int[] arr, int shiftBy) {
		shiftBy = shiftBy % (arr.length);
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < arr.length - shiftBy; i++) {
			linkedList.add(arr[i]);
		}
		for (int i = arr.length - 1; i >= arr.length - shiftBy; i--) {
			linkedList.addFirst(arr[i]);
		}
		int[] result = new int[arr.length];
		Iterator<Integer> iterator = linkedList.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			result[i] = iterator.next();
			i++;
		}
		return result;
	}
}
