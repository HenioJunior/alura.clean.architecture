package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.dominio.aluno.Email;

public class MatricularAlunoDto {
    String nomeAluno;
    String cpf;
    String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpf, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(this.cpf), nomeAluno, new Email(this.emailAluno));
    }
}
