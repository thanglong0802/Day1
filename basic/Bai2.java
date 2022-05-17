package itsol.basic;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println(", Có " + count + " ước");

	}

}
