import java.util.HashMap;
import java.util.Map;

public class FabricanteFactory {
    private static Map<String, Fabricante> fabricantes = new HashMap<>();

    public static Fabricante getFabricante(String nome, String pais) {
        Fabricante fabricante = fabricantes.get(nome);
        if (fabricante == null) {
            fabricante = new Fabricante(nome, pais);
            fabricantes.put(nome, fabricante);
        }
        return fabricante;
    }

    public static int getTotalFabricantes() {
        return fabricantes.size();
    }
}
