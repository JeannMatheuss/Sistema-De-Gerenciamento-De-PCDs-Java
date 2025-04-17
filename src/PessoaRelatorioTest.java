import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class PessoaRelatorioTest {

    @Test
    public void testGerarRelatorioAtendimentos() {
        Pessoa pessoa = new Pessoa("Clara", 45, "Motora", "Severo", "Rua D");
        Atendimento a1 = new Atendimento("2025-04-01", "Fisioterapia", "Dra. Paula");
        Atendimento a2 = new Atendimento("2025-04-05", "Psicologia", "Dr. Carlos");

        pessoa.adicionarAtendimento(a1);
        pessoa.adicionarAtendimento(a2);

        List<Atendimento> atendimentos = pessoa.getAtendimentos();

        assertEquals(2, atendimentos.size());
        assertEquals("Fisioterapia", atendimentos.get(0).getTipo());
    }
}
