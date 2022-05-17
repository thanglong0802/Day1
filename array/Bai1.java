package itsol.array;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		boolean kt = true;
		do {
			System.out.println("Nhập số phần tử trong mảng: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);

		int A[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập giá trị mảng thứ A[" + i + "] = ");
			A[i] = Integer.parseInt(sc.nextLine());
		}

		for (int i = 0; i < n / 2; i++) {
			if (A[i] != A[n - i - 1]) {
				kt = false;
				break;
			}
		}
		
		if (kt == false) {
			System.out.println("Mảng vừa nhập không phải mảng đối xứng");
		} else {
			System.out.println("Mảng vừa nhập là mảng đối xứng");
		}

	}

}
