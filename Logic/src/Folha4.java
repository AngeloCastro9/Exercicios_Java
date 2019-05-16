
public class Folha4 extends FuncaoScanner{
	
	public void dinheiro() {
		double dolarEmReal = 3.70;
		
		System.out.println("digite quantos dolares voce tem");
		double dolar = input.nextDouble();
		double valorTotal = dolar * dolarEmReal;
		
		System.out.println("Voce tem um total de: " + valorTotal + " reais");
	}
	
	public void imc() {
		double altura;
		double peso;
		double imc;
		
		System.out.println("Digite a sua altura");
		altura = input.nextDouble();
		System.out.println("Digite o seu peso");
		peso = input.nextDouble();
		
		imc = peso / altura * 2;
		
		System.out.println("o seu Imc é: " + imc);
	}
	
	public void retangulos() {
		double comprimento;
		double largura;
		double area;
		double perimetro;
		
		System.out.println("digite o comprimento do Retangulo");
		comprimento = input.nextDouble();
		System.out.println("digite a largura do Retangulo");
		largura = input.nextDouble();
		
		double totalComprimento = comprimento * 2;
		double totalLargura = largura * 2;
		
		perimetro = totalComprimento * totalLargura;
		
		area = comprimento * largura;
		
		System.out.println("O perimetro é: " + perimetro + " e a area é: " + area);
	}
	
	public void media() {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		System.out.println("Digite 4 notas");
		
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		nota3 = input.nextDouble();
		nota4 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media é de: " + media);
	}
	
	public void troca() {
		int valor1;
		int valor2;
		
		System.out.println("digite o primeiro valor");
		valor1 = input.nextInt();
		System.out.println("digite o segundo valor");
		valor2 = input.nextInt();
		
		int troca1 = valor1 = valor2;
		int troca2 = valor2 = valor1;
		
		System.out.println("Os valores são" + troca1 + troca2);
	}
	
	public void votacao() {
		int idade;
		
		System.out.println("Digite a sua idade");
		idade = input.nextInt();
		
		if (idade < 16) {
			System.out.println("Você nao pode votar");
		}
		
		else if (idade == 16 || idade == 17) {
			System.out.println("Voto facutativo");
		}
		
		else if (idade > 18 && idade < 70) {
			System.out.println("Voto obrigatorio");
		}
		
		else if (idade > 70) {
			System.out.println("Voto não obrigatorio");
		}
 	}
	
	public void dia() {
		int dia;
		int mes;
		int ano;
		
		System.out.println("digite o dia");
		dia = input.nextInt();
		if (dia > 30) {
			System.out.println("Data invalida");
		}
		
		else {
			System.out.println("Digite o mes");
			mes = input.nextInt();
			if (mes > 12) {
				System.out.println("Mês invalido");
			}
			else {
				System.out.println("digite o ano");
				ano = input.nextInt();
				if(ano > 2019) {
					System.out.println("ano invalido");
				}
				else {
					if (mes == 1) {
						System.out.println("JANEIRO");
					}
					else if (mes == 2) {
						System.out.println("FEVEREIRO");
					}
					else if (mes == 3) {
						System.out.println("MARÇO");
					}
					else if (mes == 4) {
						System.out.println("ABRIL");
					}
					else if (mes == 5) {
						System.out.println("MAIO");
					}
					else if (mes == 6) {
						System.out.println("JUNHO");
					}
					else if (mes == 7) {
						System.out.println("JULHO");
					}
					else if (mes == 8) {
						System.out.println("AGOSTO");
					}
					else if (mes == 9) {
						System.out.println("SETEMBRO");
					}
					else if (mes == 10) {
						System.out.println("OUTUBRO");
					}
					else if (mes == 11) {
						System.out.println("NOVEMBRO");
					}
					else if (mes == 12) {
						System.out.println("DEZEMBRO");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Folha4 folha = new Folha4();
		folha.dinheiro();
		folha.imc();
		folha.retangulos();
		folha.media();
		folha.troca();
		folha.votacao();
		folha.dia();
	}
}
