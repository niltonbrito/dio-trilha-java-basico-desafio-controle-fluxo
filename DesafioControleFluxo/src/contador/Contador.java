package contador;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exception.ParametroInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		
		try {
			
			System.out.print("Informe o primeiro parametro: ");
			int parametroUm = terminal.nextInt();
			System.out.print("Informe o segundo parametro: ");
			int parametroDois = terminal.nextInt();
			
			contar(parametroUm, parametroDois);
			terminal.close();
		}
		
		catch (InputMismatchException e) {
			System.out.println("Dados informados inválidos, infome números inteiros");
		}
		catch (ParametroInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException{
		
		if (parametroUm >parametroDois) {
			throw new ParametroInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
			
			System.out.println(i+1);
			
		}
		
		
	}
}