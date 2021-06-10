import javax.swing.JOptionPane;

public class EntreXeY {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
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
			JOptionPane.showMessageDialog(null, "Os números entre " +numero2+ " e " +numero1+ " são: \n" +numeros.toString());
		}
			else if (numero2 > numero1)
			{
				diferenca = numero2 - numero1;
				for (int i = 1; i < diferenca; i++)
				{
					int valor = numero1+i;
					numeros.append(valor).append(",");
					
				}
				JOptionPane.showMessageDialog(null, "Os números que estão entre " +numero1+ " e " +numero2+ " são: \n" +numeros.toString());
			}
			else
			{
			}
		
		}
}