import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private static int itens;
    private List<Material> materials;

    public Category(String name) {
        this.name = name;
        itens++;
        this.materials = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public static int getItens() {
        return itens;
    }

    public List<Material> getMaterials() {
        return this.materials;
    }

    public void addMaterial(Material material) {
        this.materials.add(material);
    }

    public void printMaterials() {

        System.out.println("----------- materias(" + this.getName() + ") -----------");
        for(int i = 0; i < materials.size(); i++) {
            System.out.println(materials.get(i).getTitle());
        }
        System.out.println("------------------------------------------------");

    }

}
