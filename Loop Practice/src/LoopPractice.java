import javax.swing.JOptionPane;

public class LoopPractice {

	public static void main(String[] args) {
		// method16();
		// method17();
		// method18();
		// method19();
		method20();
	}

	public static void method16() {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive number"));

		while (input < 0) {
			input = Integer.parseInt(JOptionPane.showInputDialog(
					"You did not enter a valid positive number.\n\n\n\nPlease enter a positive number"));
		}
		JOptionPane.showMessageDialog(null, "Thanks!");
	}

	public static void method17() {

		int input = 0;

		do {
			input = Integer.parseInt(JOptionPane.showInputDialog("Please enter an even integer"));
		} while (input % 2 != 0);

		JOptionPane.showMessageDialog(null, "Thanks!");
	}

	public static void method18() {
		final int SENTINAL = 16;
		String enteredValues = "Values Entered:\n";
		int val = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value: "));

		while (val != SENTINAL) {
			enteredValues = enteredValues + val + "\n";
			val = Integer.parseInt(JOptionPane.showInputDialog("Please enter another value: "));
		}
		JOptionPane.showMessageDialog(null, enteredValues);
	}

	public static void method19() {
		final int SENTINAL = 0;
		int product = 1;
		int val = Integer.parseInt(JOptionPane.showInputDialog("Please enter a value: "));

		while (val != SENTINAL) {
			product = product * val;
			val = Integer.parseInt(JOptionPane.showInputDialog("Please enter another value: "));
		}
		JOptionPane.showMessageDialog(null, "The product is: " + product);
	}

	public static void method20() {
		for (int i = 0; i <= 100; i++)
			if (i % 2 == 1)
				System.out.println(i);

	}
}
