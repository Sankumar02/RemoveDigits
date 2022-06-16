package Assesement_06_06_22;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDigits {

	static void removeDuplicate() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the string");

		String info = scan.nextLine();

		char str[] = info.toCharArray();

		int index = 0;

		for (int i = 0; i < str.length; i++) {

			int j;
			for (j = 0; j < i; j++) {

				if (Character.isDigit(str[i])) {

					if (str[i] == str[j]) {
						break;
					}
				}
			}

			if (j == i) {
				str[index++] = str[i];
			}
		}
		System.out.println("After Removal  : " + String.valueOf(Arrays.copyOf(str, index)));
	}

	public static void main(String[] args) {
		removeDuplicate();
	}

}