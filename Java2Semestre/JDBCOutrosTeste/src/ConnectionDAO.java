import java.sql.*;

import org.postgresql.core.ConnectionFactory;

public class ConnectionDAO {

    public void cleanup() {
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;

        try {
            stmt.executeUpdate("drop table tbl_basica");
        } catch (Exception ex) {
            // Ignorar todos os erros
        }
        con.close();

    }

    public void doexample() throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;
        System.out.println("\n Executando os testes");
        // Criar tabela que armazena os dados
        stmt.executeUpdate("create table tbl_basica (a int2, b int2)");
    }
}
