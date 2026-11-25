
public class Matriculas{
    private int idMatricula;
    private Date dataExpiracao;
    private String situacaoAtual;
    private Alunos cpf;


    public Matriculas(int idMatricula, Date dataExpiracao, String situacaoAtual) {
        this.idMatricula = idMatricula;
        this.dataExpiracao = dataExpiracao;
        this.situacaoAtual = situacaoAtual;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public Alunos getCpf() {
        return cpf;
    }

    public void setCpf(Alunos cpf) {
        this.cpf = cpf;
    }

}