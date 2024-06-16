package Program;
import java.util.Scanner;
import Exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in); 
		System.out.println("Digite o primeiro parâmetro: "); 
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois); 
		}catch (ParametrosInvalidosException exception) {
	        System.out.println("O parametroUm não pode ser maior que o parametroDois "); // Imprime a mensagem da exceção lançada, deve ser definida a mensagem
	        //nesse local. Na exceção de classe a mesma pode ser vazia!
		}
		 finally {
	            terminal.close(); // Fechar o Scanner no finally para garantir que o recurso seja liberado
	    }
		
	}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			if(parametroUm > parametroDois ) {
				throw new ParametrosInvalidosException();
			}else{
				int contagem = parametroDois - parametroUm;//define a condição para que o catch seja acionado!
				
				//realizar o for para imprimir os números com base na variável contagem
				for(int x = 1; x <= contagem; x++ ) {
					System.out.println("\nImprimindo o número " + x);
				}

			}
		}
}



