package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MaterialRepository {

    // Adiciona uma nova categoria;
    public void addCategory(String categoryName) {
        
        String sql = "INSERT INTO CATEGORY (name) VALUES (?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, sql);
            int rowsAffected = stmt.executeUpdate();
            
            if(rowsAffected > 0) {
                System.out.println("Categoria "+ categoryName +" adicionada com sucesso.");

            } else {
                System.out.println("Falha ao adicionar a categoria.");

            }
 
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar a categoria: " + e.getMessage());

        }
    }
}
