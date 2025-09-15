public class Material {
    private String title;
    private String description;
    private String author;
    private String pathFile;
    private String category;
    private int material_id;
    
    public Material(String title, String description, String author, String pathFile, String category,int material_id) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.pathFile = pathFile;
        this.category = category;
        this.material_id = material_id;
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

    public void printInfos() {
        System.out.println("-------------- Informacoes do material --------------");
        System.out.println("Titulo: " + this.getTitle());
        System.out.println("Descricao: " + this.getDescription());
        System.out.println("Autor: " + this.getAuthor());
        System.out.println("Categoria: " + this.getCategory());
        System.out.println("-----------------------------------------------------");

    }
}
