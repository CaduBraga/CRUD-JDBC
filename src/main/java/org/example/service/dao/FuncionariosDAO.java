package org.example.service.dao;

import org.example.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionariosDAO {

    public boolean inserir(String nome, String cargo, double salario) {
        String sql = "INSERT INTO funcionarios (nome, cargo, salario) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, cargo);
            stmt.setDouble(3, salario);
            stmt.executeUpdate();

            System.out.println("Funcionário inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
