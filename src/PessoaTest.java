import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testCadastroPessoa() {
        Pessoa pessoa = new Pessoa("Maria", 35, "Auditiva", "Moderado", "Rua das Flores");
        assertEquals("Maria", pessoa.getNome());
        assertEquals(35, pessoa.getIdade());
        assertEquals("Auditiva", pessoa.getTipoDeficiencia());
        assertEquals("Moderado", pessoa.getGrauDeDeficiencia());
        assertEquals("Rua das Flores", pessoa.getEndereco());
    }
}
