// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seedCount = Integer.parseInt(args[0]);
		String mode = args[1].toLowerCase();

		for (int i=1; i<=seedCount; i++) {
			int counter = 1;
			int n = i;

			if (mode.indexOf('v') != -1)
				System.out.println();
			do {
				counter++;
				if (mode.indexOf('v') != -1)
					System.out.print(n + " ");
				if (n % 2 == 0)
					n /= 2;
				else
					n = 3 * n + 1;
			} while (n != 1);
			if (mode.indexOf('v') != -1)
				System.out.print(1 + " (" + counter + ")");
		}
		if (mode.indexOf('v') != -1)
			System.out.println();
		System.out.println("Every one of the first " + seedCount + " hailstone sequences reached 1.");
	}
}
