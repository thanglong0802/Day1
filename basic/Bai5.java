package itsol.basic;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số nguyên bất kỳ: ");
		int n = Integer.parseInt(sc.nextLine());
		int temp = n;
		int tong = 0;
		while (n > 0) {
			int kq = n % 10;
			tong += kq;
			n /= 10;
		}
		System.out.println("Tổng các chữ số " + temp + " = " + tong);
		
	}

}
