package model;

public class Organizador extends PessoaResponsavel{

    private String funcaoAdm;  // coordenador ou responsaveis por inscricoes


    public Organizador(String nome, String email, int cpf, String curso, String funcaoAdm) {
        super(nome, email, cpf, curso);
        this.funcaoAdm = funcaoAdm;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }
}
