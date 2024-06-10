package dao;

import conexao.ConexaoBD;

public class CarroDao {
    ConexaoBD conexao = ConexaoBD.getInstance();

    public void carro(String fabricante, String modelo, int ano, float tabelafipe, int kmnopainel, String placa) {
        String sql = "INSERT INTO carros (marca, modelo, ano, tabelafipe, kmnopainel, placa) VALUES ('" + fabricante + "', '" + modelo + "', '"
            + ano + "', '" + tabelafipe + "', '" + kmnopainel + "', '" + placa +"');";
        conexao.executarSQL(sql);
        conexao.closeConDB();

    }

}
