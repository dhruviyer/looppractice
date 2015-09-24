import javax.swing.JOptionPane;

public class LoopPractice {
	
	public static void main(String[] args){
		//method16();
		method17();
	}
	
	public static void method16(){
		int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive number"));
		
		while(input<0){
			input = Integer.parseInt(JOptionPane.showInputDialog("You did not enter a valid positive number.\n\n\n\nPlease enter a positive number"));
		}
		JOptionPane.showMessageDialog(null, "Thanks!");
	}
	
	public static void method17(){
		int input = 0; 
		
		do{
			input = Integer.parseInt(JOptionPane.showInputDialog("Please enter an even integer"));
		}while(input%2 != 0);
		
		JOptionPane.showMessageDialog(null, "Thanks!");
	}
}
