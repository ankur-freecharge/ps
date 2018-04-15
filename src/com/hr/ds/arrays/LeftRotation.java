package com.hr.ds.arrays;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // array size
		int d = scan.nextInt(); // number of rotations
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int[] result = new int[n];
		for (int i = 0; i < array.length; i++) {
			int temp = i - d;
			int position;
			if (temp < 0) {
				position = temp + 6;
			} else {
				position = temp;
			}
			result[position] = array[i];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
