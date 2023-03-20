package br.com.escola.dominio.aluno;

import br.com.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    @DisplayName("Não deveria criar cpf's inválidos")
    void cpfInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("055555333"));
    }

    @Test
    @DisplayName("Deveria criar um cpf válido")
    void cpfValido() {
        CPF novoCpf = new CPF("011.111.222-22");
        assertEquals("011.111.222-22", novoCpf.getNumero());
    }
}
