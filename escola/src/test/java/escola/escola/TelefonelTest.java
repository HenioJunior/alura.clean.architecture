package escola.escola;

import escola.CPF;
import escola.Telefone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefonelTest {

    @Test
    @DisplayName("Não deveria criar telefones inválidos")
    void telefoneInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("111", "9911111110"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("4a", "9911111a"));

    }

    @Test
    @DisplayName("Deveria criar um telefone válido")
    void telefoneValido() {
        Telefone novoTelefone = new Telefone("43", "999999999");
        assertEquals("43", novoTelefone.getDdd());
        assertEquals("999999999", novoTelefone.getNumero());
    }
}
