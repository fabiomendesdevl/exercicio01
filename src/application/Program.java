package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Fatura;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Fatura> fatura = new ArrayList<>();	
		
		System.out.println("Quantidade de itens que deseja inserir: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Item #" + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Descrição do item: ");
			sc.nextLine();
			String descricao = sc.nextLine();
			System.out.print("Insira o valor do item: ");
			double valor = sc.nextDouble();
			System.out.print("Insira a quantidade de itens: ");
			int quantidade = sc.nextInt();
			
			Fatura fat = new Fatura(nome, descricao, valor, quantidade);
			
			fatura.add(fat);
		}
		System.out.println();
		
		for(Fatura list : fatura) {
			
			System.out.println(list);
		}
		double valorTotal = 0.0;
		for (Fatura list : fatura) {
			valorTotal = valorTotal + list.totalFatura();
		}
		System.out.print("Valor total de todos os itens: " +valorTotal);
		
		sc.close();
	}

}
