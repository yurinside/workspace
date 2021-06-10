
public class AlgoritmoCpf {

	public static void main(String[] args) {

		int[] cpf = new int[11];
		cpf[0] = 9;
		cpf[1] = 4;
		cpf[2] = 0;
		cpf[3] = 4;
		cpf[4] = 9;
		cpf[5] = 7;
		cpf[6] = 9;
		cpf[7] = 2;
		cpf[8] = 0;
//		cpf[9] = x;
//		cpf[10] = x;
// 		cpf = 111444777XX

		int p = 0;
		int soma = 0;

		for (int i = 10; i >= 2; i--) {

			int mult = i * cpf[p];
			soma = soma + mult;
			//System.out.println("i:" + i + ",p:" + p + ",cpf:" + cpf[p] + ",X:" + mult);
			p = p + 1; // p++ mesma coisa!
			
		}

		//System.out.println(soma);
		// obter o resto da divisão soma/11
		
		int resto = soma % 11;
		//System.out.println(resto);
		// se o resto da divisão for menor que 2 digito verificador = 0
		// se não fazer a operação 11-(resto da divisão)
		if (resto < 2) {
			cpf[9] = 0;
		} else {
			cpf[9] = 11 - resto;
		}
		
		//System.out.println("primeiro digito:"+cpf[9]);
		
		p = 0;
		soma = 0;
		
		for(int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma = soma + mult;
			//System.out.println("i:" + i + ",p:" + p + ",cpf:" + cpf[p] + ",X:" + mult);
			p = p + 1; // p++ mesma coisa!
		}
		
		//System.out.println(soma);
		
		resto = soma % 11;
		if( resto < 2 ) {
			cpf[10] = 0;
		}else {
			cpf[10] = 11 - resto;
		}
		
		for(int i = 0; i <= 10; i++) {
			System.out.print(cpf[i]);
		}

	}

}