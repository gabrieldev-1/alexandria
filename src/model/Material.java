package model;

public class Material {
    private int id_material;
    private String title;
    private String author;
    private String link;
    private int id_category; // Foreign Key

    public Material(int id_material, String title, String author, String link, int id_category) {
        this.id_material = id_material;
        this.title = title;
        this.author = author;
        this.link = link;
        this.id_category = id_category;
    }

    public int getId() {
        return this.id_material;
    }

    public void setId(int id_material) {
        this.id_material = id_material;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIdCategory() {
        return id_category;
    }

    public void setIdCategory(int id_category) {
        this.id_category = id_category;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id_material=" + id_material +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", link='" + link + '\'' +
                ", id_category=" + id_category +
                '}';
    }
}
