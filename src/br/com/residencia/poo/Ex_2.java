package br.com.residencia.poo;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.println("Escreva seu nome: ");
		nome = ler.nextLine();
		System.out.println("Olá, " + nome);
		
		ler.close();

	}

}
