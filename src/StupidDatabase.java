public class StupidDatabase {
    public static void main(String[] args) {
        Category javaCategory = new Category("java");
        Category pythonCategory = new Category("python");

        Material materialOne = new Material("Java tutorial", "Uma aula de java para iniciantes", "Gabriel dos Santos", "#", javaCategory.getName()
        , 0);
        javaCategory.addMaterial(materialOne);

        Material materialTwo = new Material("Python: Como voce nunca viu.", "Uma introducao a linguagem python", "Andreia de Almeida", "#", pythonCategory.getName(), 1);
        pythonCategory.addMaterial(materialTwo);
    }

}
