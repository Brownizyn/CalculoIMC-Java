package br.com.matheus.main;

//Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

//Importa a classe Pessoa 
import br.com.matheus.calculavel.impl.Pessoa;

//Define a classe Main que contém o método main para testar o sistema
public class Main {

	// Define a classe Main que contém o método main para testar o sistema
	public static void main(String[] args) {
		 // Cria um objeto Scanner para leitura de dados do usuário
		  Scanner scanner = new Scanner(System.in);

		  // Solicita e lê o nome do usuário
	        System.out.print("Digite o nome: ");
	        String Nome = scanner.nextLine();

	     // Solicita e lê a idade do usuário
	        System.out.print("Digite a idade: ");
	        int Idade = scanner.nextInt();

	     // Solicita e lê o peso do usuário
	        System.out.print("Digite o peso (kg): ");
	        double Peso = scanner.nextDouble();

	     // Solicita e lê a altura do usuário
	        System.out.print("Digite a altura (m): ");
	        double Altura = scanner.nextDouble();

	     // Cria uma instância da classe Pessoa com os dados fornecidos pelo usuário
	        Pessoa pessoa = new Pessoa(Nome, Idade, Peso, Altura);

	     // Calcula o IMC da pessoa
	        double imc = pessoa.calcularIMC();
	     // Classifica o IMC da pessoa
	        String classificacao = pessoa.classificarIMC();

	     // Exibe o IMC e a classificação da pessoa
	        System.out.printf("IMC de %s: %.2f\n", pessoa.getNome(), imc);
	        System.out.println("Classificação: " + classificacao);
	    }
	} // Fonte de Pesquisa: https://www.w3schools.com/java/java_user_input.asp


