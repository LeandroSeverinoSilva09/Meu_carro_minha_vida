package meu_carro_minha_vida;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarroDao {
    ConexaoBD conexao = ConexaoBD.getInstance();

    public void cadastrocarro(cadastrocarro cadastrocarro) {
        String sql = "INSERT INTO CARRO (MARCA, MODELO, KM_NO_PAINEL, TABELA_FIPE, ANO, PLACA) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = conexao.getConnection().prepareStatement(sql);

            stmt.setString(1, cadastrocarro.getMarca());
            stmt.setString(2, cadastrocarro.getModelo());
            stmt.setInt(3, cadastrocarro.getKmnoPainel());
            stmt.setFloat(4, cadastrocarro.getTabelaFipe());
            stmt.setInt(5, cadastrocarro.getAnodoveiculo());
            stmt.setString(6, cadastrocarro.getPlaca());

            // Executa a instrução SQL
            stmt.executeUpdate();
            System.out.println("Carro cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar carro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }

            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
