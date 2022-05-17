package itsol.array;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.println("Nhập số phần tử trong mảng: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);

		int A[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ A[" + i + "] = ");
			A[i] = Integer.parseInt(sc.nextLine());
		}
		
		int maxArr = A[0];
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					maxArr = A[j];
					A[j] = A[i];
					A[i] = maxArr;
					
				}
			}
			
		}
		
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (A[i] == A[j]) {
					count += 1;
				}
			}
			if (i == 0 || A[i] != A[i - 1]) {
				System.out.println(A[i] + " xuất hiện " + count + " lần");
			}
			int max = 1;
			if (count > max) {
				max = count;
				maxArr = i;
			}
		}
		System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + A[maxArr]);
		
	}

}
