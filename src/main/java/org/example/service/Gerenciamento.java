package org.example.service;

import org.example.view.Interface;
import org.example.service.dao.*;

import java.sql.Date;

public class Gerenciamento {

    private final Interface ui = new Interface();

    private final ProdutosDAO produtosDAO = new ProdutosDAO();
    private final PedidosDAO pedidosDAO = new PedidosDAO();
    private final LivrosDAO livrosDAO = new LivrosDAO();
    private final FuncionariosDAO funcionariosDAO = new FuncionariosDAO();
    private final AlunoDAO alunoDAO = new AlunoDAO();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void iniciar() {
        while (true) {
            int tabela = ui.menuTabela();
            if (tabela == 0) break;

            int acao = ui.menuAcao();

            switch (tabela) {
                case 1 -> gerenciarProdutos(acao);
                case 2 -> gerenciarPedidos(acao);
                case 3 -> gerenciarLivros(acao);
                case 4 -> gerenciarFuncionarios(acao);
                case 5 -> gerenciarAlunos(acao);
                case 6 -> gerenciarUsuarios(acao);
                default -> ui.exibirMensagem("Opção inválida.");
            }
        }

        ui.exibirMensagem("Programa encerrado.");
    }

    private void gerenciarProdutos(int acao) {
        if (acao == 1) {
            String nome = ui.solicitarTexto("Nome do produto: ");
            double preco = ui.solicitarDouble("Preço: ");
            int quantidade = ui.solicitarInteiro("Quantidade: ");
            if (produtosDAO.inserir(nome, preco, quantidade)) {
                ui.exibirMensagem("Produto inserido com sucesso!");
            } else {
                ui.exibirMensagem("Erro ao inserir produto.");
            }
        }
    }

    private void gerenciarPedidos(int acao) {
        if (acao == 1) {
            String cliente = ui.solicitarTexto("Nome do cliente: ");
            String dataStr = ui.solicitarTexto("Data do pedido (YYYY-MM-DD): ");
            double total = ui.solicitarDouble("Total: ");
            Date data = Date.valueOf(dataStr);
            if (pedidosDAO.inserir(cliente, data, total)) {
                ui.exibirMensagem("Pedido inserido com sucesso!");
            } else {
                ui.exibirMensagem("Erro ao inserir pedido.");
            }
        }
    }

    private void gerenciarLivros(int acao) {
        if (acao == 1) {
            String titulo = ui.solicitarTexto("Título: ");
            String autor = ui.solicitarTexto("Autor: ");
            int ano = ui.solicitarInteiro("Ano de publicação: ");
            if (livrosDAO.inserir(titulo, autor, ano)) {
                ui.exibirMensagem("Livro inserido com sucesso!");
            } else {
                ui.exibirMensagem("Erro ao inserir livro.");
            }
        }
    }

    private void gerenciarFuncionarios(int acao) {
        if (acao == 1) {
            String nome = ui.solicitarTexto("Nome: ");
            String cargo = ui.solicitarTexto("Cargo: ");
            double salario = ui.solicitarDouble("Salário: ");
            if (funcionariosDAO.inserir(nome, cargo, salario)) {
                ui.exibirMensagem("Funcionário inserido com sucesso!");
            } else {
                ui.exibirMensagem("Erro ao inserir funcionário.");
            }
        }
    }

    private void gerenciarAlunos(int acao) {
        if (acao == 1) {
            String nome = ui.solicitarTexto("Nome do aluno: ");
            String matricula = ui.solicitarTexto("Matrícula: ");
            String curso = ui.solicitarTexto("Curso: ");
            if (alunoDAO.inserir(nome, matricula, curso)) {
                ui.exibirMensagem("Aluno inserido com sucesso!");
            } else {
                ui.exibirMensagem("Erro ao inserir aluno.");
            }
        }
    }

    private void gerenciarUsuarios(int acao) {
        if (acao == 1) {
            String nome = ui.solicitarTexto("Nome do usuário: ");
            String email = ui.solicitarTexto("Email: ");
            if (usuarioDAO.inserir(nome, email)) {
                ui.exibirMensagem("Usuário inserido com sucesso!");
            } else {
                ui.exibirMensagem("Erro ao inserir usuário.");
            }
        }
    }
}
