package br.com.residencia.poo;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Escreva seu nome: ");
		nome = ler.nextLine();
		System.out.println("Agora digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("\n\n\nOlá, " + nome + "\nVocê tem "
		+ idade + " anos?!");
		
		ler.close();
	}

}
