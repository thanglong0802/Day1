package itsol.basic;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int i;
		if (n % 2 == 0) {
			i = 2;
		} else {
			i = 1;
		}
		
		long tong = 0;
		
		for ( ; i <= n; i+=2) {
			tong += i;
		}
		
		System.out.println("Tổng các số chẵn/ lẻ của " + n + " là: " + tong);

		System.out.println("====================");
		
		double sum = 0;
		for (int j = 1; j <= n; j++) {
			sum += (double) 1/j;
		}
		
		System.out.println(sum);
	}

}
