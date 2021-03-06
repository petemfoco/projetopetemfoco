package projetaobcc20172.com.projetopetemfoco.model;

import com.google.firebase.database.Exclude;

import java.io.Serializable;


/**
 * Created by renat on 06/12/2017.
 */

public class Fornecedor implements Serializable {

    //Atributos do fornecedor
    private String mId;
    private String mNome;
    private String mEmail;
    private String mTelefone;
    private String mCpfCnpj;
    private String mHorarios;
    private String mSenha;
    private String mSenha2;
    /*Variável que é setada para o valor "0" quando um consumidor está se cadastrando, para que ao cadastrar o seu endereço,
    a verificação na classe de Endereço saiba que ali o endereço deve ser cadastrado no nó do Consumidor,
    pois ambos, fornecedor e consumidor compartilham a mesma classe de Endereço.*/
    private String mEnderecoFornecedor = "1";
    private Endereco mEndereco;

    public Fornecedor(String nome,String email,String cpfCnpj,String telefone,String senha,String senha2,String horarios){
        this.mNome = nome;
        this.mEmail = email;
        this.mSenha = senha;
        this.mSenha2 = senha2;
        this.mHorarios = horarios;
        this.mCpfCnpj = cpfCnpj;
        this.mTelefone = telefone;
    }

    public Fornecedor(){}

    @Exclude
    public String getId() { return mId; }

    public void setId(String id) {
        this.mId = id;
    }

    public String getNome() {
        return mNome;
    }

    public void setNome(String nome) {
        this.mNome = nome;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getTelefone() {
        return mTelefone;
    }

    public void setTelefone(String telefone) {
        this.mTelefone = telefone;
    }

    public String getCpfCnpj() {
        return mCpfCnpj;
    }

    public void setCpfCnpj(String cpf_cnpj) {
        this.mCpfCnpj = cpf_cnpj;
    }

    public String getHorarios() {
        return mHorarios;
    }

    public void setHorarios(String horarios) {
        this.mHorarios = horarios;
    }

    @Exclude
    public String getSenha() {
        return mSenha;
    }

    public void setSenha(String senha) {
        this.mSenha = senha;
    }

    @Exclude
    public String getSenha2() {
        return mSenha2;
    }

    public void setSenha2(String senha2) {
        this.mSenha2 = senha2;
    }

    public Endereco getEndereco() {
        return mEndereco;
    }

    public void setEndereco(Endereco endereco) {
        this.mEndereco = endereco;
    }

    public String getEnderecoFornecedor() {
        return mEnderecoFornecedor;
    }

    public void setEnderecoFornecedor(String valor) {
        this.mEnderecoFornecedor = valor;
    }
}
