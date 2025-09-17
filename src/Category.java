import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private static int nextId = 1;
    private int id;
    private List<Material> materials;

    public Category(String name) {
        this.name = name;
        this.id = nextId++;
        this.materials = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public List<Material> getMaterials() {
        return this.materials;
    }

    public void printMaterials() {

        System.out.println("----------- materias(" + this.getName() + ") -----------");
        for(int i = 0; i < materials.size(); i++) {
            materials.get(i).printInfos();
        }
    }
}
