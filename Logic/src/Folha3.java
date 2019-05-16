public class Folha3 extends FuncaoScanner{
	
	public void votacao() {
		int anoAtual = 2019;
		
		System.out.println("Digite o ano que voce nasceu");
		int ano = input.nextInt();
		
		if ((anoAtual - ano) >= 18) {
			System.out.println("Você pode votar");
		}
		else {
			System.out.println("Você não pode votar");
		}
	}
	
	public void conta() {
		System.out.println("Digite o numero da conta");
		String numeroConta = input.next();
		System.out.println("Digite o saldo da conta");
		int saldo = input.nextInt();
		System.out.println("Digite o debito da conta");
		int debito = input.nextInt();
		System.out.println("Digite o credito da conta");
		int credito = input.nextInt();
		
		int saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0 ) {
			System.out.print("Saldo POSITIVO");
		}
		else {
			System.out.print("Saldo NEGATIVO");
		}
	}
	
	public void frutas() {
		
		System.out.println("quantas frutas você quer comprar?");
		int quantidade = input.nextInt();
		
		if (quantidade >= 12) {
			System.out.println("Você ira pagar: " + quantidade * 1);
		}
		else {
			System.out.println("Você ira pagar: " + quantidade * 1.3);
		}
	}
	
	public static void main (String[] args) {
		Folha3 folha = new Folha3();
		folha.votacao();
		folha.conta();
		folha.frutas();
	}
	
}
