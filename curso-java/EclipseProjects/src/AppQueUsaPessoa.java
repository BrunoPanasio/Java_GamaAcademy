import java.util.Scanner;

public class AppQueUsaPessoa {

	public static void main(String[] args) {
		String nome, email, salario;
		Scanner teclado = new Scanner(System.in);
		nome = teclado.nextLine();
		email = teclado.nextLine();
		salario = teclado.nextLine();
		Pessoa p = new Pessoa(nome,email, Float.parseFloat(salario));
		System.out.println(p.getNome());
		System.out.println(p.getEmail());
		System.out.println(p.getSalario());

		teclado.close();
	}

}
