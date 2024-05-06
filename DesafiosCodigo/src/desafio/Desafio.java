package desafio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		// Lê os valores de entrada:
		Scanner terminalEntrada = new Scanner(System.in).useLocale(Locale.US);
		try {

			System.out.print("Informe o Salário Bruto: ");
			float valorSalario = terminalEntrada.nextFloat();
					
			System.out.print("Informe o adicional dos benefícios: ");
			float valorBeneficio = terminalEntrada.nextFloat();
			
			float valorImposto = 0;
			if (valorSalario >= 0 && valorSalario <= 1100) {
				// Atribui a aliquota de 5% mediante o salário:
				valorImposto = 0.05F * valorSalario;
			}else if (valorSalario >= 1100.01 && valorSalario <= 2500.00 ) {
				// Atribui a aliquota de 5% mediante o salário:
				valorImposto = 0.10F * valorSalario;
			}else {
				// Atribui a aliquota de 5% mediante o salário:
				valorImposto = 0.15F * valorSalario;
			}
			
			// Calcula e imprime a Saída (com 2 casas decimais):
			float salarioLiquido = valorSalario - valorImposto + valorBeneficio;
			System.out.println("Salário liquído: "+String.format("%.2f", salarioLiquido));
			
			terminalEntrada.close();
		} catch (InputMismatchException e) {
			System.out.println("Dados informado inválido, informe somente números.");
		}

	}

}
