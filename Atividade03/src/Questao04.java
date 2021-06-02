import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Questao04 {

	public static void main(String[] args) {

		double produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta: "));
		double totalPedido = produto;
		double garcom = totalPedido * 0.1;
		DecimalFormat df = new DecimalFormat("###.##");
		JOptionPane.showMessageDialog(null, "10% do garçom: " + df.format(garcom) + "\n Total: " + totalPedido, "Conta: ", JOptionPane.PLAIN_MESSAGE);
	}

}