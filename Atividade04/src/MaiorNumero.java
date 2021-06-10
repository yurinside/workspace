import javax.swing.JOptionPane;

public class MaiorNumero extends JOptionPane {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
		
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, "O maior número é: "+numero1);
		}
		 
		else if
		(numero1 < numero2){
			JOptionPane.showMessageDialog(null,"O maior número é: "+numero2);
		}	
		if
		(numero1 == numero2){
			JOptionPane.showMessageDialog(null,"Números iguais.");
		
		}

	}
}