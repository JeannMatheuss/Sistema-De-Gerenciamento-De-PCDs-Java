import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CadastroPessoasTest {

    @Test
    public void testFiltrarPorDeficiencia() {
        CadastroPessoas cadastro = new CadastroPessoas();

        Pessoa p1 = new Pessoa("Maria", 35, "Auditiva", "Moderado", "Rua A");
        Pessoa p2 = new Pessoa("João", 28, "Visual", "Leve", "Rua B");
        Pessoa p3 = new Pessoa("Ana", 40, "Auditiva", "Severo", "Rua C");

        cadastro.adicionarPessoa(p1);
        cadastro.adicionarPessoa(p2);
        cadastro.adicionarPessoa(p3);

        List<Pessoa> resultado = cadastro.filtrarPorDeficiencia("Auditiva");

        assertEquals(2, resultado.size());
    }
}
