package itsol.array;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử trong mảng: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập x (để xem x gần vị trí với số nguyên tố nào trong mảng): ");
		int x = Integer.parseInt(sc.nextLine());
		
		int A[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]: ");
			A[i] = sc.nextInt();
		}
		
		int viTri = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (soNT(A[i]) && getMin(A[i], x) < min) {
				min = getMin(A[i], x);
				viTri = i;
			}
		}
		
		if (viTri != 0) {
			System.out.println("Chỉ số phần tử: " + viTri + ", giá trị gần nhất là: " + A[viTri]);
		} else {
			System.out.println("Không tồn tại giá trị thỏa mãn!");
		}
		
	}
	
	public static int getMin(int a, int x) {
		return Math.abs(a - x);
	}
	
	public static boolean soNT(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
