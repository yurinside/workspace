  
import javax.swing.*;

public class Questao01 {	

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
		int vizinho1 = numero - 1;
		int vizinho2 = numero + 1; 
		JOptionPane.showMessageDialog(null,"Os números vizinhos são  "+vizinho1+ " e " +vizinho2);
	}
}