  
import javax.swing.*;

public class Questao01 {	

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero"));
		int vizinho1 = numero - 1;
		int vizinho2 = numero + 1; 
		JOptionPane.showMessageDialog(null,"Os n�meros vizinhos s�o  "+vizinho1+ " e " +vizinho2);
	}
}