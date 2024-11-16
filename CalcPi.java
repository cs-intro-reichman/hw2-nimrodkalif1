// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int calcs = Integer.parseInt(args[0]);
		double n = 1;
		double sum = 1 / n - 1 / (n + 2);
		n += 2;

		for (int i = 0; i < calcs-2; i++) {
			if (i % 2 == 0)
				sum += 1 / (n + 2);
			else
				sum -= 1 / (n + 2);
			n += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum*4);
	}
}
