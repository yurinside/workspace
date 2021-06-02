import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		float horas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		float n1 = horas;
		
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora: "));
		float n2 = valor;
		
		float n3 = n1*n2;
		JOptionPane.showMessageDialog(null, "O salário do funcionário é: " +n3);
		

	}

}