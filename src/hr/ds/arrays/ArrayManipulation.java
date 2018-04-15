package hr.ds.arrays;

import java.util.Scanner;

/*
 * 5 3
1 2 100
2 5 100
3 4 100
 */
public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		long[] arr = new long[n];

		int lower;
		int upper;
		long sum;

		for (int i = 0; i < n; i++)
			arr[i] = 0;

		for (int i = 0; i < m; i++) {
			lower = scan.nextInt();
			upper = scan.nextInt();
			sum = scan.nextInt();
			arr[lower - 1] = arr[lower - 1] + sum;
			if (upper < n) {
				arr[upper] = arr[upper] - sum;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		long max = 0;
		long temp = 0;

		for (int i = 0; i < n; i++) {
			temp = temp + arr[i];
			if (temp > max)
				max = temp;
		}

		System.out.println(max);
	}
}
