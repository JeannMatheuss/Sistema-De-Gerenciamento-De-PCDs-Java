public class Atendimento implements Acompanhamento{
    private String data;
    private String tipo;
    private String profissionalResponsavel;

    @Override
    public void registrarAtendimento() {
        System.out.println("Atendimento de " + tipo + " cadastrado.");
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório: Atendimento em " + data + " por " + profissionalResponsavel);
    }
}
