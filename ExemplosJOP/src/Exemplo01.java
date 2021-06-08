import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Janela Básica");
		JOptionPane.showMessageDialog(null, "Olá Mundo JOP", "!!Alerta!!", JOptionPane.ERROR_MESSAGE);

		JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
		Object[] options = { "OK", "Cancelar", "VOLTAR" };
		JOptionPane.showOptionDialog(null, "Clique Ok para continuar!", "Alerta", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		String nome = JOptionPane.showInputDialog("Digite seu nome!");
		System.out.println("O nome digitado foi: " + nome);

		Object[] itens = { "Maça", "Pera", "Banana" };
		Object itemSelecionado = JOptionPane.showInputDialog(null, "Escolha 1 item", "Itens",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[1]);
		System.out.println("Item selecionado: " + itemSelecionado.toString());

	}

}