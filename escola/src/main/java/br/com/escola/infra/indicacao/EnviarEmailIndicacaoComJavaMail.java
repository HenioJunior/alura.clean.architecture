package br.com.escola.infra.indicacao;

import br.com.escola.aplicacao.EnviarEmailIndicacao;
import br.com.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //lógica de envio de emails com a lib JAVA Mail
    }
}
