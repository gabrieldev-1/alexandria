import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Category> categories;

    public Database() {
        this.categories = new ArrayList<>();
        
    }

    // Metodos referentes as "Categorias"

    public List<Category> getCategories() {
        return this.categories;
    }

    public void addCategory(String name) {
        Category newCategory = new Category(name);
        int listSize = categories.size();

        if(listSize == 0) {
            categories.add(newCategory);
            return;
        }

        for(Category category : categories) {
            if(category.getName().equals(newCategory.getName())) {
                System.out.println("Essa categoria ja existe.");
                return;

            }
        }

        categories.add(newCategory);
    }

    public Category searchCategory(int category_id) {
        for(int i = 0; i < this.categories.size(); i++) {
            Category currCategory = categories.get(i);

            if(currCategory.getId() == category_id) {
                return currCategory;
            }
        }
        
        System.out.println("Categoria nao encontrada.");
        return null;
    }

    public void printCategorys() {
        int listSize = categories.size();

        if(listSize == 0) {
            System.out.println("Nao existem categorias no momento.");
            return;
        }

        System.out.println("-------------- CATEGORIAS --------------");

        for(int i = 0; i < listSize; i++) {    
            System.out.println("(" + categories.get(i).getId() +")" + categories.get(i).getName());
        }

        System.out.println("----------------------------------------");
    }

    public void printMaterials(Category category) {
        if (category.getMaterials().isEmpty()) {
            System.out.println("Nenhum material cadastrado nesta categoria.");
            return;
        }
        System.out.println("Materiais da categoria " + category.getName() + ":");
        for(Material material : category.getMaterials()) {
            this.printInfosMaterials(material);
        }
    }

    // Metodos referentes aos "materiais";

    public void addMaterial(String title, String description, String author, String pathFile, String categoryName) {
        for(Category cat : categories) {
            if(cat.getName().equals(categoryName)) {
                Material newMaterial = new Material(title, description, author, pathFile, categoryName);
                cat.getMaterials().add(newMaterial);
                return;
            }
        }
        System.out.println("Categoria nao encontrada.");
    }



    public void printInfosMaterials(Material material) {

        System.out.println("-------------- Informacoes do material --------------");
        System.out.println("Titulo: " + material.getTitle());
        System.out.println("Descricao: " + material.getDescription());
        System.out.println("Autor: " + material.getAuthor());
        System.out.println("Categoria: " + material.getCategory());
        System.out.println("-----------------------------------------------------");

    }
}
