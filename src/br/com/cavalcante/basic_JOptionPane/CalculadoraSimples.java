package br.com.cavalcante.basic_JOptionPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class CalculadoraSimples {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Calculadora Simples.");

        // Declaração das variáveis
        final int[] op1 = new int[1];
        final int[] op2 = new int[1];
        final int[] resultado = new int[1];
        final char[] operacao = new char[1];

        // Criação da janela da calculadora
        JFrame janela = new JFrame("Calculadora Simples");
        janela.setLayout(new GridLayout(4, 4));
        janela.setSize(300, 200);
        janela.setVisible(true);

        // Criação dos botões numéricos
        for (int i = 0; i <= 9; i++) {
            Button botao = new Button(Integer.toString(i));
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Adiciona o número do botão à tela
                    Label display = (Label) janela.getContentPane().getComponent(0);
                    display.setText(display.getText() + e.getActionCommand());
                }
            });
            janela.add(botao);
        }

        // Criação dos botões de operação
        Button botaoMais = new Button("+");
        botaoMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Armazena o primeiro operando
                Label display = null;
                op1[0] = Integer.parseInt(display.getText());
                // Limpa a tela
                display.setText("");
                // Define a operação
                operacao[0] = '+';
            }

        });
        janela.add(botaoMais);
        janela.setVisible(true);

        Button botaoMenos = new Button("-");
        botaoMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Armazena o primeiro operando
                Label display = null;
                op1[0] = Integer.parseInt(display.getText());
                // Limpa a tela
                display.setText("");
                // Define a operação
                operacao[0] = '-';
            }
        });
        janela.add(botaoMenos);
        janela.setVisible(true);

        Button botaoVezes = new Button("*");
        botaoVezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Armazena o primeiro operando
                Label display = null;
                op1[0] = Integer.parseInt(display.getText());
                // Limpa a tela
                display.setText("");
                // Define a operação
                operacao[0] = '*';
            }
        });
        janela.add(botaoVezes);
        janela.setVisible(true);

        Button botaoDivisao = new Button("/");
        botaoDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Armazena o primeiro operando
                Label display = null;
                op1[0] = Integer.parseInt(display.getText());
                // Limpa a tela
                display.setText("");
                // Define a operação
                operacao[0] = '/';
            }
        });
        janela.add(botaoDivisao);
        janela.setVisible(true);

        // Criação do botão de igual
        Button botaoIgual = new Button("=");
        botaoIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Armazena o segundo operando
                Label display = null;
                op2[0] = Integer.parseInt(display.getText());
                // Limpa a tela
                display.setText("");

                // Processa a operação
                switch (operacao[0]) {
                    case '+':
                        resultado[0] = op1[0] + op2[0];
                        break;
                    case '-':
                        resultado[0] = op1[0] - op2[0];
                        break;
                    case '*':
                        resultado[0] = op1[0] * op2[0];
                        break;
                    case '/':
                        if (op2[0] == 0) {
                            JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");

                        }else {
                            resultado[0] = op1[0] / op2[0];
                            break;
                        }
                    default:
                        JOptionPane.showMessageDialog(null, "Resultado" + resultado[0]);
                        break;

                }

            }
        });
        janela.add(botaoIgual);
        janela.setVisible(true);


    }
}