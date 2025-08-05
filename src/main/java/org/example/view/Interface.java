package org.example.view;

import java.util.Scanner;

public class Interface {
    private final Scanner input = new Scanner(System.in);

    public int menuTabela() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("Escolha a tabela:");
        System.out.println("1 - Produtos");
        System.out.println("2 - Pedidos");
        System.out.println("3 - Livros");
        System.out.println("4 - Funcionários");
        System.out.println("5 - Alunos");
        System.out.println("6 - Usuários");
        System.out.println("0 - Sair");
        System.out.print("> ");
        return input.nextInt();
    }
    public int menuAcao() {
        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Inserir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Deletar");
        System.out.println("4 - Listar");
        System.out.print("> ");
        return input.nextInt();
    }

    public String solicitarTexto(String msg) {
        System.out.print(msg);
        input.nextLine();
        return input.nextLine();
    }

    public int solicitarInteiro(String msg) {
        System.out.print(msg);
        return input.nextInt();
    }

    public double solicitarDouble(String msg) {
        System.out.print(msg);
        return input.nextDouble();
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
