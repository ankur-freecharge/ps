package hr.ds.arrays;

public class ArraysDS {
	/*
	 * create a new array and add in reverse order
	 * O(n) and extra space
	 */
	static int[] reverseArray(int[] a) {
		int length = a.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = a[length - i - 1];
		}
		return result;
	}

	/*
	 * reverse the same array
	 * swap last to one and continue
	 */
	static int[] reverseArray2(int[] a) {
		int length = a.length;

		for (int i = 0; i < length/2; i++) {
			int temp = a[i];
			a[i] = a[length - i - 1];
			a[length - i - 1] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 1, 6, 7, 5 };
		int[] result = reverseArray2(input);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
