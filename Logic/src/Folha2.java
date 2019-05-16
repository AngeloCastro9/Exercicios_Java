import java.util.Scanner;
public class Folha2 extends FuncaoScanner{

	public void alunos() {
		System.out.println("Digite a primeira nota");
		Double nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota");
		Double nota2 = input.nextDouble();
		System.out.println("Digite a terceira nota");
		Double nota3 = input.nextDouble();
		System.out.println("Digite a quarta nota");
		Double nota4 = input.nextDouble();
		
		Double mediaTotal = (nota1 + nota2 + nota3 + nota4) /4;
		
		if (mediaTotal >= 7 ) {
			System.out.println("aluno aprovado");
		}
		else if(mediaTotal >= 5 ) {
			System.out.println("Aluno aprovado em exame");
		}
		
		else {
			System.out.println("aluno reprovado");
		}
	}
	
	public void nomes() {
		System.out.println("digite o primeiro nome");
		String nome1 = input.next();
		System.out.println("digite o segundo nome");
		String nome2 = input.next();
		
		if (nome1.equals(nome2)) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("são diferentes");
		}
	}
	
	public void valores() {
		
		System.out.println("digite um valor");
		double valor = input.nextDouble();
		
		if (valor >= 0 ) {
			System.out.println("é positivo");
		}
		else {
			System.out.println("é negativo");
		}
	}
	
	public void maiorValor() {
		
		System.out.println("Digite o primeiro numero");
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo numero");
		int numero2 = input.nextInt();
		
		if (numero1 != numero2) {
			if (numero1 > numero2) {
				System.out.println("O maior numero é " + numero1);
			}
			else {
				System.out.println("O maior numero é " + numero2);
			}
		}
		else {
			System.out.println("Os numeros são iguais");
		}
	}
	
	public void crescente() {
		System.out.println("Digite o primeiro numero");
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo numero");
		int numero2 = input.nextInt();
		
		if (numero1 != numero2) {
			if (numero1 > numero2) {
				System.out.printf( "%s  %s ", numero1 , numero2);
			}
			else {
				System.out.printf("%s  %s ", numero2 , numero1);
			}
		}
		else {
			System.out.println("Os numeros sao iguais, nada foi feito");
		}
	}
	
	public void antecessor() {
		System.out.println("Digite um valor");
		int valor = input.nextInt();
		
		System.out.println("O antecessor do numero digitado é: " + ((valor) - 1));
	}
	
	public void jogo() {
		System.out.println("Digite o nome do primeiro time");
		String time1 = input.next();
		System.out.println("Digite a quantidade de gols do primeiro time");
		int golsTime1 = input.nextInt();
		System.out.println("Digite o nome do segundo time");
		String time2 = input.next();
		System.out.println("Digite a quantidade de gols do segundo time");
		int golsTime2 = input.nextInt();
		
		if (time1.equals(time2)) {
			System.out.println("O nome dos times são iguais");
		}
		else {
			if (golsTime1 > golsTime2) {
				System.out.println("O time vencendor foi o: " + time1);
			}
			
			else if(golsTime2 > golsTime1) {
				System.out.println("O time vencedor foi o: " + time2);
			}
			
			else if (golsTime1 == golsTime2) {
				System.out.println("EMPATE");
			}
		}
	}
	
	public static void main (String[] args) {
		Folha2 folha = new Folha2();
		folha.alunos();
		folha.nomes();
		folha.valores();
		folha.maiorValor();
		folha.crescente();
		folha.antecessor();
		folha.jogo();
	}
}
