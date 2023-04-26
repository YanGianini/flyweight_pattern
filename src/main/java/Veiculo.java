public class Veiculo {
    private String nome;
    private Integer ano;
    private Fabricante fabricante;

    public Veiculo(String nome, Integer ano, Fabricante fabricante){
        this.nome = nome;
        this.ano = ano;
        this.fabricante = fabricante;
    }

    public String obterVeiculo() {
        return "Veiculo{" +
                "nome='" + this.nome +"'" +
                ", ano=" + this.ano +
                ", fabricante='" + this.fabricante.getNome() +
                "', pais='"+ this.fabricante.getPais() +"'}";
    }
}
