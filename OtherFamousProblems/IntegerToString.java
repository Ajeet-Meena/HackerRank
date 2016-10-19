
public class IntegerToString {

	public static void main(String arg[]) {
		System.out.println(intToString(-1234522));
	}

	public static String intToString(int n) {
		// 1234
		boolean isNegative = false;
		if (n < 0) {
			isNegative = true;
			n = (-1) * (n);
		}
		int temp = n;
		String result = "";
		while (temp != 0) {
			int temp1 = temp;
			temp1 = temp1 % 10;
			result = result + temp1;
			temp = temp / 10;
		}
		StringBuilder stringBuilder = new StringBuilder(result);
		stringBuilder.reverse();
		if (isNegative) {
			return "-" + stringBuilder.toString();
		} else {
			return stringBuilder.toString();
		}
	}
}
