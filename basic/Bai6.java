package itsol.basic;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int i = 2;
		if (n == 1) {
			System.out.println("1 = 1");
		} else {
			System.out.print(n + " = ");
			while (n != 1) {
				if (n % i == 0) {
					System.out.print(i + " * ");
					n /= i;
				} else {
					++i;
				}
			}
		}

	}

}
