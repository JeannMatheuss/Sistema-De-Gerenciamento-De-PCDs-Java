public class Pessoa implements Cadastro {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grauDeDeficiencia;
    private String endereco;

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grauDeDeficiencia, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grauDeDeficiencia = grauDeDeficiencia;
        this.endereco = endereco;
    }

    @Override
    public void cadastrar() {
        System.out.println("Pessoa cadastrada: " + nome);
    }

    @Override
    public void listar() {
        System.out.println("Nome: " + nome + ", Deficiência: " + tipoDeficiencia);
    }
}
