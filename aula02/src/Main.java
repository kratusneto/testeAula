import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite o seu nome completo: ");
		Scanner nome = new Scanner (System.in);
		String nomeDaPessoa = nome.nextLine();
		if (nomeDaPessoa.contains(" ")) {
			System.out.println("Nome válido.");
		}else{
			System.out.println("Nome inválido.");
		}
		
		System.out.println("Digite a sua idade: ");
		Scanner idade = new Scanner (System.in);
		int idadeDaPessoa = idade.nextInt();
		
		System.out.println("Digite o seu e-mail: ");
		Scanner email = new Scanner (System.in);
		String emailDaPessoa = email.next();
		if (emailDaPessoa.contains("@")) {
			System.out.println("E-mail válido.");
		}else{
			System.out.println("E-mail inválido.");
		}
		
		System.out.println("Digite a sua cidade: ");
		Scanner cidade = new Scanner (System.in);
		String cidadeDaPessoa = cidade.nextLine();
		
		
		System.out.println("Digite o seu Estado: ");
		Scanner estado = new Scanner (System.in);
		String estadoDaPessoa = estado.nextLine();
		
		System.out.println("Nome: "+nomeDaPessoa);
		System.out.println("E-mail: "+emailDaPessoa);
		System.out.println("Cidade: "+cidadeDaPessoa);
		System.out.println("Estado: "+estadoDaPessoa);
		System.out.println("Idade: "+idadeDaPessoa+" anos.");
		if (idadeDaPessoa <= 2){
			System.out.println("Bebê");
		}
		if (idadeDaPessoa > 2 && idadeDaPessoa <= 12) {
			System.out.println("Criança");
		}
		if (idadeDaPessoa > 12 && idadeDaPessoa <= 16) {
			System.out.println("Pré-Adolescente");
		}
		if (idadeDaPessoa > 16 && idadeDaPessoa <= 21) {
			System.out.println("Adolescente");
		}
		if (idadeDaPessoa > 21 && idadeDaPessoa <= 65) {
			System.out.println("Adulto");
		}
		if (idadeDaPessoa >= 66) {
			System.out.println("Idoso");
		}
	}

}
