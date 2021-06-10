  
import javax.swing.JOptionPane;

public class PalavraDeAcesso extends JOptionPane {

	public static void main(String[] args) {

				String palavraChave = JOptionPane.showInputDialog("Digite a palavra de acesso");
				
				if(palavraChave.equals("Java-2021"))
				{
					JOptionPane.showMessageDialog(null, "Aprovada.");
				}
				else 
				{
					for (int i=5; i >=1; i--)
					{
						JOptionPane.showInputDialog("Tente novamente. Você tem " +i+ " tentativas");
					}
				}

			}

		}