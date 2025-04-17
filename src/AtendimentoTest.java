import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AtendimentoTest {

    @Test
    public void testCadastroAtendimento() {
        Atendimento atendimento = new Atendimento("2025-04-16", "Fisioterapia", "Dra. Ana");

        assertEquals("2025-04-16", atendimento.getData());
        assertEquals("Fisioterapia", atendimento.getTipo());
        assertEquals("Dra. Ana", atendimento.getProfissionalResponsavel());
    }
}
