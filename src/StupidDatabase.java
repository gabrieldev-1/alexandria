import java.util.ArrayList;

public class StupidDatabase {
    public static void main(String[] args) {

        // Lista de categorias
        ArrayList<Category> categories = new ArrayList<>();

        // Categorias
        Category javaCategory = new Category("java");
        categories.add(javaCategory);

        Category pythonCategory = new Category("python");
        categories.add(pythonCategory);

        // Materias instanciados
        Material materialOne = new Material("Java tutorial", "Uma aula de java para iniciantes", "Gabriel dos Santos", "#", javaCategory.getName()
        , 0);
        javaCategory.addMaterial(materialOne);

        Material materialTwo = new Material("Python: Como voce nunca viu.", "Uma introducao a linguagem python", "Andreia de Almeida", "#", pythonCategory.getName(), 1);
        pythonCategory.addMaterial(materialTwo);
    }

}
