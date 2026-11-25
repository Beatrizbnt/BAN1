public class Alunos {
    private Long cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private String email;
    private PersonalTrainers personal;

    public Alunos (Long cpf, String nome, String telefone, String endereco, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonalTrainers getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalTrainers personal) {
        this.personal = personal;
    }

     public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("cpf: "+cpf+" nome: "+nome+" telefone: "+telefone+
                " endereço: "+endereco+" e-mail: "+email);
        // if(personal!= null)
        //     sb.append(" nome: "+ambulatorio.getAndar()+" capacidade: "+ambulatorio.getCapacidade());
        return sb.toString();
    }      
}
