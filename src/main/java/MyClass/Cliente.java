package MyClass;

import java.util.Calendar;

public class Cliente {
    private String nome;
    private String nomedoMeio;
    private String ultimoNome;
    private String nomeCompleto;
    private String cpf;
    private Strin dtNascimento;
    private int idadeAtual;
    private String emailCliente;
    private String generoCliente;
    private String enderecoCliente;
    private String telefoneCliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomedoMeio() {
        return nomedoMeio;
    }

    public void setNomedoMeio(String nomedoMeio) {
        this.nomedoMeio = nomedoMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Strin getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Strin dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getIdadeAtual() {
        return idadeAtual;
    }

    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    //Construtor
    public Cliente(String nome, String nomedoMeio,
                   String ultimoNome, String nomeCompleto,
                   String cpf, Strin dtNascimento, int idadeAtual,
                   String emailCliente, String generoCliente,
                   String enderecoCliente, String telefoneCliente) {
        this.nome = nome;
        this.nomedoMeio = nomedoMeio;
        this.ultimoNome = ultimoNome;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.idadeAtual = idadeAtual;
        this.emailCliente = emailCliente;
        this.generoCliente = generoCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;

        //Meus Metodos

        private int definirIdadeAtual(){
            int anoAtual = recuperarAnoAtual();
            int anoNascimento = recuperarAnoNascimento();
            return anoAtual - anoNascimento;
        }

        public int recuperarAnoNascimento(){
            Calendar calendario = Calendar.getInstance();
            Date dataDeNascimentoCliente;
            try {
                dataDeNascimentoCliente = definirFormatoData("").parse(dataDeNascimento);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            calendario.setTime(dataDeNascimentoCliente);
            return calendario.get(Calendar.YEAR);
        }


    }
}
