import javax.swing.JOptionPane;

public class MaiorNumero extends JOptionPane {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+numero1);
		}
		 
		else if
		(numero1 < numero2){
			JOptionPane.showMessageDialog(null,"O maior n�mero �: "+numero2);
		}	
		if
		(numero1 == numero2){
			JOptionPane.showMessageDialog(null,"N�meros iguais.");
		
		}

	}
}