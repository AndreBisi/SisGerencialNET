package SisGerencialNet;

import java.sql.ResultSet;

public class CidadeDAO {
	
	public void getDados(int codigo, Cidade cidade) throws Exception {

		ConexaoPGSQL banco = new ConexaoPGSQL();
		banco.Conectar("", "", "");
		ResultSet rs = banco.stmt.executeQuery("select * from tbCidade where cidadeCod = " + codigo);

		if (rs.next()) {
			cidade.setCodigo(rs.getInt("cidadeCod"));
			cidade.setNome(rs.getString("cidadeNome"));
			cidade.setUF(rs.getString("cidadeUF"));
			cidade.setIBGE(rs.getString("cidadeIBGE"));

		} else {
			throw new Exception("Cidade não localizada");
		}

		banco.Desconectar();
	}

}
