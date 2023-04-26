import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcessionariaTest {

    @Test
    void deveRetornarVeiculos(){
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.registrarVeiculo("Onix", 2023, "GM", "EUA");
        concessionaria.registrarVeiculo("Cruze", 2023, "GM", "EUA");
        concessionaria.registrarVeiculo("Argo", 2023, "FIAT", "ITA");

        List<String> retorno = Arrays.asList(
               "Veiculo{nome='Onix', ano=2023, fabricante='GM', pais='EUA'}",
                "Veiculo{nome='Cruze', ano=2023, fabricante='GM', pais='EUA'}",
                "Veiculo{nome='Argo', ano=2023, fabricante='FIAT', pais='ITA'}"
        );
        assertEquals(retorno, concessionaria.obterVeiculos());
    }

    @Test
    void deveRetornarTotalMontadoras() {
        Concessionaria concessionaria = new Concessionaria();
        concessionaria.registrarVeiculo("Onix", 2023, "GM", "EUA");
        concessionaria.registrarVeiculo("Cruze", 2023, "GM", "EUA");
        concessionaria.registrarVeiculo("Argo", 2023, "FIAT", "ITA");

        assertEquals(2, FabricanteFactory.getTotalFabricantes());
    }
}
