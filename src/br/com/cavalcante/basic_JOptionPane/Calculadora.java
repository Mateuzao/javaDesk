package br.com.cavalcante.basic_JOptionPane;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        // Declaração das variáveis
        int op1, op2, resultado;
        char operacao;


        op1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro Numero Inteiro:"));   // Leitura dos operandos
        operacao = JOptionPane.showInputDialog("Informe a operação (+, -, *, /):").charAt(0);       // Leitura da operação
        op2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo Numero Inteiro:"));   // Leitura dos operandos



        // Processamento da operação
        switch (operacao) {
            case '+':
                resultado = op1 + op2;
                break;
            case '-':
                resultado = op1 - op2;
                break;
            case '*':
                resultado = op1 * op2;
                break;
            case '/':
                if (op2 == 0) {
                    JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                    return;
                }
                resultado = op1 / op2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                return;
        }

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}