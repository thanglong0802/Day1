package itsol.lesson1;

public class Bai7 {

	static boolean kiemTraSoNT(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static boolean kiemTraSoLe(int n) {
		int a;
		while (n > 0) {
			a = n % 10;
			n /= 10;
			if (a % 2 == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		for (int i = 111111; i <= 999999; i++)
			if (kiemTraSoNT(i) && kiemTraSoLe(i))
				System.out.println(i);
	}

}
