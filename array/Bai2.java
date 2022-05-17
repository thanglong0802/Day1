package itsol.array;

import java.util.Scanner;

public class Bai2 {

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

		int max = A[0];
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					max = A[j];
					A[j] = A[i];
					A[i] = max;
				}
			}
		}
		
		System.out.println("Mảng sau khi sắp xếp: ");
		for (int i : A) {
			System.out.print(i + " ");
		}
		
	}

}
