import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
	String primeiro;
	String segundo;
	int n1, n2, soma;
	
	primeiro = JOptionPane.showInputDialog("Digite um número:");
	segundo = JOptionPane.showInputDialog("Digite mais um número:");
	
	n1 = Integer.parseInt(primeiro);
	n2 = Integer.parseInt(segundo);
	
	soma = n1+n2;
	
	JOptionPane.showConfirmDialog(null, "A soma entre os números é: "+soma, "Resultado da soma: ", JOptionPane.PLAIN_MESSAGE);
	System.exit(0);
	
	
	
	}

}
