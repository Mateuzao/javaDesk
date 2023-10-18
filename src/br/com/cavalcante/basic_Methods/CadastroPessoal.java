package br.com.cavalcante.basic_Methods;

import java.util.Scanner;

public class CadastroPessoal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Lê o sobrenome do usuário
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Lê a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Lê o local de nascimento do usuário
        System.out.print("Digite seu local de nascimento:");
        String local = scanner.nextLine();
        System.out.print(" ");
        String local2 = scanner.nextLine();

        System.out.println("-----Resultado---------");
        // Exibe o cadastro no terminal
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Local de nascimento: " + local2);
    }
}
