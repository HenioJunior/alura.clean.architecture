package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dados = new MatricularAlunoDto("Bob", "123.456.789-00", "bob@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        Assertions.assertEquals("Bob", encontrado.getNome());
        Assertions.assertEquals("123.456.789-00", encontrado.getCpf());
        Assertions.assertEquals("bob@email.com", encontrado.getEmail());
    }
}