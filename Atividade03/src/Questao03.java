import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int n1, n2, media;
		String primeiraNota, segundaNota;

		primeiraNota = JOptionPane.showInputDialog("Informe a primeira nota: ");
		segundaNota = JOptionPane.showInputDialog("Informe a segunda nota: ");

		n1 = Integer.parseInt(primeiraNota);
		n2 = Integer.parseInt(segundaNota);

		media = (n1 + n2) / 2;

		JOptionPane.showMessageDialog(null, "A média é: " + media,"Resultado da média: ", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);

	}

}
