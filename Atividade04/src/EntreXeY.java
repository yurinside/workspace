import javax.swing.JOptionPane;

public class EntreXeY {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
		int diferenca = 0;
		StringBuilder numeros = new StringBuilder();
		if( numero1 > numero2)
		{
			
			diferenca = numero1-numero2;
			
			for (int i = 1; i < diferenca; i++)
			{
				int valor = numero2+i;
				numeros.append(valor).append(",");
								
			}
			JOptionPane.showMessageDialog(null, "Os n�meros entre " +numero2+ " e " +numero1+ " s�o: \n" +numeros.toString());
		}
			else if (numero2 > numero1)
			{
				diferenca = numero2 - numero1;
				for (int i = 1; i < diferenca; i++)
				{
					int valor = numero1+i;
					numeros.append(valor).append(",");
					
				}
				JOptionPane.showMessageDialog(null, "Os n�meros que est�o entre " +numero1+ " e " +numero2+ " s�o: \n" +numeros.toString());
			}
			else
			{
			}
		
		}
}