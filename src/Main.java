import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] agrs) {

        System.out.println("Testando conexao com o servidor...");

        try(Connection conn = DatabaseManager.getConnection()) {
            if (conn != null) {
                System.out.println("Conexao estabelecida com sucesso!");
            
            } else {
                System.out.println("Falha na conexao. Conexao retornou nula.");

            }

        } catch (SQLException ex) {
            System.err.println("Erro na conexao: " + ex.getMessage());
        }

    }
}
