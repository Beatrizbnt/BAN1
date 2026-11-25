import java.sql.Date;

public class Pagamentos {
    private int idPagamento;
    private Date dataPagamento;
    private String situacaoPagamento;
    private Number valor;
    private String formaPagamento;
    private Matriculas IdMatricula;

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Matriculas getIdMatricula() {
        return IdMatricula;
    }

    public void setIdMatricula(Matriculas idMatricula) {
        IdMatricula = idMatricula;
    }

    public Pagamentos(int idPagamento, Date dataPagamento, String situacaoPagamento, Number valor,
            String formaPagamento) {
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.situacaoPagamento = situacaoPagamento;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getSituacaoPagamento() {
        return situacaoPagamento;
    }

    public void setSituacaoPagamento(String situacaoPagamento) {
        this.situacaoPagamento = situacaoPagamento;
    }

     public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    
}
