package itsol.basic;

import java.util.Scanner;

public class Bai3 {

	static int USCLN;
	static int BSCNN;
	public static void main(String[] args) {
		
		int temp1, temp2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số thứ hai: ");
		int num2= Integer.parseInt(sc.nextLine());
		temp1 = num1;
		temp2 = num2;
		
		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
			} else {
				num2 -= num1;
			}
		}
		USCLN = num2;
		System.out.println("USCLN của 2 số là: " + USCLN);
		System.out.println("BSCNN của 2 số là: " + (BSCNN = (temp1 * temp2) / USCLN));

	}

}
