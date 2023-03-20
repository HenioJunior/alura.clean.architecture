package escola.escola;

import escola.Email;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    @DisplayName("Não deveria criar emails com endereços inválidos")
    void emailEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("abcde"));
    }

    @Test
    @DisplayName("Deveria criar emails válidos")
    void criarEmail() {
        Email novoEmail = new Email("aluno@email.com");
        assertEquals("aluno@email.com", novoEmail.getEndereco());
    }
}
