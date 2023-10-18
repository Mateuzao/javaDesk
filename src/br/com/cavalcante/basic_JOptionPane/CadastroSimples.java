package br.com.cavalcante.basic_JOptionPane;

import javax.swing.JOptionPane;

public class CadastroSimples {

    public static void main(String[] args) {
        // Declara as variáveis para armazenar o nome, o sobrenome, a idade e o local
        String nome, sobrenome, local;
        int idade;

        // Lê o nome
        nome = JOptionPane.showInputDialog("Digite o seu nome:");

        // Lê o sobrenome
        sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome:");

        // Lê a idade
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        // Lê o local
        local = JOptionPane.showInputDialog("Digite o seu local de nascimento:");

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " " + sobrenome + ", você tem " + idade + " anos e nasceu em " + local);
    }

}