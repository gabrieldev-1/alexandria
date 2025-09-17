import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Category> categories;

    public Database() {
        this.categories = new ArrayList<>();
        
    }

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
            if(category.getName() == newCategory.getName()) {
                System.out.println("Essa categoria ja existe.");
                return;
            }
        }

        categories.add(newCategory);

    }

    public void addMaterial(String title, String description, String author, String pathFile, String categoryName) {
        for(Category cat : categories) {
            if(cat.getName().equals(categoryName)) {
                Material newMaterial = new Material(title, description, author, pathFile, pathFile);
                cat.getMaterials().add(newMaterial);
                return;
            }
        }

        System.out.println("Categoria nao encontrada.");

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
}
