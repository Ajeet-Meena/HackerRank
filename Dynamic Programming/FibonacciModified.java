import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

	static int a;
	static int b;
	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		 dpProgram1();
	}

	public static void dpProgram1() {
		a = scanner.nextInt();
		b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.print(getfib(c));
	}

	private static BigInteger getfib(int c) {
		if (c == 1) {
			return BigInteger.valueOf(a);
		} else if (c == 2) {
			return BigInteger.valueOf(b);
		} else {
			return getfib(c - 2).add(getfib(c - 1).multiply(getfib(c - 1)));
		}
	}
}
