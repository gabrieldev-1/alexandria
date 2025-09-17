public class Material {
    private String title;
    private String description;
    private String author;
    private String pathFile;
    private String category;
    private int material_id;
    private static int next_material_id; // CORRIGIDO
    
    public Material(String title, String description, String author, String pathFile, String category) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.pathFile = pathFile;
        this.category = category;
        this.material_id = next_material_id++;

    }

    public String getPathFile() {
        return this.pathFile;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCategory() {
        return this.category;
    }

    public int getId() {
        return this.material_id;
    }
}
