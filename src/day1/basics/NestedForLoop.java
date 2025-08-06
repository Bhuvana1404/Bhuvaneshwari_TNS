package day1.basics;

public class NestedForLoop {

	public static void main(String[] args) {
		int start=10;
		int finish=20;

		for (int i = start; i <= finish; i++) {
			for (int a = 1; a <= 10; a++) {
				System.out.println(i + "*" + a + "= " + i * a);
			}
			System.out.println();

		}

	}
}