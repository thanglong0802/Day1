package itsol.array;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử mảng a: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhập mảng (a, n): ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Nhập số phần tử mảng b: ");
		int m = sc.nextInt();
		int[] b = new int[m];
		System.out.println("Nhập mảng (b, m): ");
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("Nhập vị trí cần chèn: ");
		int p = sc.nextInt();
		for (int i = 0; i < p; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < m; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println("Mảng sau khi chèn: ");
		for (int i = p; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
