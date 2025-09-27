package model;

public class Category {
    private int id_category;
    private String nameCategory;

    public Category(int id_category, String nameCategory) {
        this.id_category = id_category;
        this.nameCategory = nameCategory;
    }

    public int getId() {
        return this.id_category;
    }

    public void setId(int id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return this.nameCategory;
    }

    public void setName(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", nameCategory='" + nameCategory +
                '}';
    }
}
