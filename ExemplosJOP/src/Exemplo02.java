import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		
		String sexo =JOptionPane.showInputDialog(null, "Digite M ou F para o sexo!");
		String mensagem = "";
		
		if (sexo.length() > 1 || sexo.length() == 0 ) {
			mensagem = "Digite apenas 1 caracter!";
		}else if (sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
		}else if (sexo.toUpperCase().equals("F")) {
			mensagem = "Feminino";
		}else {
			mensagem = "Valor não encontrado";
		}
		JOptionPane.showConfirmDialog(null, mensagem);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua mensagem"));
		if (idade >= 18) {
			JOptionPane.showConfirmDialog(null, "Ok, você já pode tirar uma CNH.");
		} else {
			JOptionPane.showConfirmDialog(null, "Desculpe, você não pode tirar uma CNH.");
			
		}

	}

}
