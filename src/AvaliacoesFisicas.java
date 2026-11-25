import java.sql.Date;

public class AvaliacoesFisicas {
    private int idAvaliacao;
    private float peso;
    private float altura;
    private float percentualGordura;
    private Date dataAvaliacao;
    private Alunos cpf;

    public AvaliacoesFisicas(int idAvaliacao, float peso, float altura, float percentualGordura, Date dataAvaliacao) {
        this.idAvaliacao = idAvaliacao;
        this.peso = peso;
        this.altura = altura;
        this.percentualGordura = percentualGordura;
        this.dataAvaliacao = dataAvaliacao;
    }
    
    
    public int getIdAvaliacao() {
        return idAvaliacao;
    }


    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getPercentualGordura() {
        return percentualGordura;
    }


    public void setPercentualGordura(float percentualGordura) {
        this.percentualGordura = percentualGordura;
    }


    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }


    public void setDataAvaliacao(Date dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }


    public Alunos getCpf() {
        return cpf;
    }


    public void setCpf(Alunos cpf) {
        this.cpf = cpf;
    }


}
