package TakeHome;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindNthSmallestNumber {

	public static void main(String[] args) {

		int[] nmbrs = generateRandomNumbers(500);

		Arrays.sort(nmbrs);

		System.out.println(nmbrs);

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of N to find the Nth smallest number: ");
		int n = scan.nextInt();

		if (n < 1 || n > nmbrs.length) {
			System.out.println("N should be between 1 and 500.");

			return;

		}

		System.out.println("The " + n + "th smallest number is: " + nmbrs[n - 1]);

		scan.close();
	}

	private static int[] generateRandomNumbers(int count) {
		int[] nmbrs = new int[count];
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			nmbrs[i] = random.nextInt(1000);
		}
		return nmbrs;
		
		
	}
	
	

}
