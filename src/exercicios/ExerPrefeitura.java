package exercicios;
/*
 * A prefeitura de uma cidade deseja realizar um cadastro associado a uma pesquisa entre seus
 * Habitantes, coletando dados sobre de identificação(nome), o salario e numero de filhos.
 * A prefeitura deseja saber: (4 pontos)
 * A) Media do salario da popúlação.
 * B) Media do numero de fihlos.
 * C) Maior e Menor Salario.
 * D) Cadastro dos dados (CRUD -apenas operaçoes de <stronm>Cadastrar e Listar</strong> são obrigado
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

import entities.Usuario;

public class ExerPrefeitura {
	
	public static Scanner scan;
	public static ArrayList<Usuario> users = new ArrayList<>();

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int op = menuOpcao();
		double mediaSalarial = 0, somaSalarios = 0;
		int mediaFilhos = 0, somaFilhos = 0;
		double maiorSalario = 0, menorSalario = 0;
		
		// Usuarios para teste
		users.add(new Usuario("Augusto Silva", 1340.20, 2));
		users.add(new Usuario("Maria Brown", 1452.20, 5));
		users.add(new Usuario("Alex Green", 1635.20, 4));
		users.add(new Usuario("João Gabriel", 1562, 3));
		
		do {
			switch (op) {
				case 1:
					users.add(cadastrarUsuario());
					break;
				case 2:
					System.out.println("--------------- Todos Usuarios ---------------");
					for (Usuario user : users) {			
						System.out.printf("Nome: %s, Salario: R$ %.2f, NmFilos: %d\n", user.getNome(), user.getSalario(), user.getNumFilhos());
					}
					System.out.println("--------------------------------------------------");
					System.out.println();
					break;
				case 3:
					System.out.println("--------------- MEDIA SALARIO ---------------");
					for (Usuario user : users) {
						somaSalarios += user.getSalario();
					}
					mediaSalarial = somaSalarios / users.size();
					System.out.println("Media Salarial: R$ " + mediaSalarial + "\n");
					break;
				case 4:
					for (Usuario user : users) {
						somaFilhos += user.getNumFilhos();
					}
					mediaFilhos = somaFilhos / users.size();
					System.out.printf("Media do Numero de Filhos: %d\n\n", mediaFilhos);
					break;
				case 5:
					for (int i=0; i<users.size(); i++) {
						if (i == 0) {
							maiorSalario = users.get(i).getSalario();
							menorSalario = users.get(i).getSalario();
						} else {
							if(users.get(i).getSalario() > maiorSalario) {
								maiorSalario = users.get(i).getSalario();
							}else if(users.get(i).getSalario() < menorSalario) {
								menorSalario = users.get(i).getSalario();
							}
						}
					}
					System.out.printf("Maior Salario: R$ %.2f\n", maiorSalario);
					System.out.printf("Menor Salario: R$ %.2f\n", menorSalario);
					System.out.println();
					break;
				default:
					System.out.println("Opção Invalida!\n");
					break;
			}
			op = menuOpcao();
		} while (op != 0);

	}

	public static int menuOpcao() {
		System.out.println("------- PREFEITURA DE AÇAILANDIA -------");
		System.out.println("1 - Cadastrar Usuarios.");
		System.out.println("2 - Mostrar Usuarios Cadastrados.");
		System.out.println("3 - Media Salarial dos Usuarios.");
		System.out.println("4 - Media do Numero de Filhos.");
		System.out.println("5 - Maior Salario e Menor Salario.");
		System.out.println("0 - Sair.");
		System.out.print("Entre com a opção desejada: ");
		int op = scan.nextInt();
		System.out.println();
		return op;
	}

	public static Usuario cadastrarUsuario() {
		Usuario user;
		System.out.print("Nome: ");
		scan.nextLine();
		String nome = scan.nextLine();
		System.out.print("Salario: R$ ");
		double salario = scan.nextDouble();
		System.out.print("Numeros de Filhos: ");
		int numFilhos = scan.nextInt();
		user = new Usuario(nome, salario, numFilhos);
		return user;
	}

}
