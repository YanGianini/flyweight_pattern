import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private List<Veiculo> veiculos = new ArrayList<>();

    public void registrarVeiculo(String nomeVeiculo, Integer anoVeiculo, String nomeFabricante, String paisFabricante){
        Fabricante fabricante = FabricanteFactory.getFabricante(nomeFabricante, paisFabricante);
        Veiculo veiculo = new Veiculo(nomeVeiculo, anoVeiculo, fabricante);
        veiculos.add(veiculo);
    }

    public List<String> obterVeiculos() {
        List<String> retorno = new ArrayList<String>();
        for (Veiculo veiculo: this.veiculos) {
            retorno.add(veiculo.obterVeiculo());
        }
        return retorno;
    }
}
