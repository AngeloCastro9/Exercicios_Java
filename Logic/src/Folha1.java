import java.util.Scanner;

public class Folha1 extends FuncaoScanner{
	
	public void numeros() {
		System.out.println("digite um numero");
		int numero1 = input.nextInt();
		
		if (numero1 > 5) {
			System.out.println("o numero é maior que 5");
		}
		
		else if (numero1 == 5) {
			System.out.println("o numero é igual a 5");
		}
		
		else {
			System.out.println("o numero é menor que 5");
		}
	}
	
	public void soma() {
		System.out.println("digite o primeiro numero");
		int numero1 = input.nextInt();
		System.out.println("digite o segundo numero");
		int numero2 = input.nextInt();
		
		int soma = (numero1 + numero2);
		
		if (soma > 10 ) {
			System.out.println("A soma é maior que 10");
		}
		
		else if (soma == 10) {
			System.out.println("A soma é igual a 10");
		}
		
		else {
			System.out.println("A soma é menor que 10");
		}
	}
	
	public void notas() {
		System.out.println("digite a primeira nota");
		double nota1 = input.nextDouble();
		System.out.println("digite a segunda nota");
		double nota2 = input.nextDouble();
		System.out.println("digite a terceira nota");
		double nota3 = input.nextDouble();
		System.out.println("digite a segunda nota");
		double nota4 = input.nextDouble();
		
		double soma = (nota1 + nota2 + nota3 + nota4) /4;
		
		if (soma >= 7.0) {
			System.out.println("Aluno aprovado");
		}
		
		else {
			System.out.println("aluno reprovado");
		}
	}
	
	public void salario() {
		System.out.println("digite o seu salario atual");
		double salario1 = input.nextDouble();
		
		double reajuste = (salario1) * 10/100;
		
		double total = (salario1 + reajuste);
		
		System.out.println("O salario após o reajuste sera de: " + total);
	}
	
	public void temperatura() {
		Scanner temperatura = new Scanner(System.in);
		System.out.println("digite a temperatura em celsius");
		int celsius = temperatura.nextInt();
		
		double fahrenheit = celsius * 1.8 + 32; 
		
		System.out.println("A temperatura atual em Fahrenheit é de: " + fahrenheit);
	}
	
	public void idade() {
		int anoAtual = 2019; // digite aqui o ano atual para subtrair com o ano de nascimento da pessoa.
		System.out.println("Digite o ano que voce nasceu");
		int anoDias = input.nextInt();
		System.out.println("Digite o mes que voce nasceu");
		int mesDias = input.nextInt();
		System.out.println("Digite o dia que voce nasceu");
		int diaDias = input.nextInt();
		
		int totalAno = (anoAtual - anoDias) * 365;
		int totalMes = mesDias * 30;
		
		int total = (totalAno + totalMes + diaDias);
		
		System.out.println("Voce esta vivo a: " + total + " dias");
		
	}
	
	public static void main (String[] args) {
		Folha1 folha = new Folha1();
		folha.numeros();
		folha.soma();
		folha.notas();
		folha.salario();
		folha.temperatura();
		folha.idade();
	}
	
}
