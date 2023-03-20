package br.com.escola.infra.aluno;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricularAluno(Aluno aluno) {
        matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado!"));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
