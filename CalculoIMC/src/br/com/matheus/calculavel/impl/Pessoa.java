package br.com.matheus.calculavel.impl;

//Define uma classe chamada Pessoa que implementa a interface Calculavel
public class Pessoa implements Calculavel{
	 // Declaração de atributos privados da classe
	private String Nome;
	private int Idade;
	private double Peso;
	private double Altura;
	
	// Construtor da classe Pessoa para inicializar os atributos
	public Pessoa(String nome, int idade, double peso, double altura) {
		super();
		Nome = nome;
		Idade = idade;
		Peso = peso;
		Altura = altura;
	}

    // Implementação do método calcularIMC() da interface Calculavel
	@Override
	public double calcularIMC() {
		// Calcula o IMC usando a fórmula peso / (altura * altura)
		return Peso / (Altura * Altura);
	}
	
	 // Método para classificar o IMC conforme os critérios fornecidos
    public String classificarIMC() {
    	 // Chama o método calcularIMC() para obter o valor do IMC
        double imc = calcularIMC();
     // Classifica o IMC conforme os diferentes intervalos
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    // Métodos getters e setters para acessar e modificar os atributos privados
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}
	
	
}
