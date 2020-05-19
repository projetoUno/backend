package br.com.lavaJato.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name="TB_CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NumberFormat
    private Long id_cliente;

    @NotEmpty(message = "{name.not.blank}")
    private String nome;

    @Email(message = "{email.not.valid}")
    private String email;

    @Min(value=0)
    private  Long telefone;

    @Min(value=0)
    private int ddd;

    @Min(value=0)
    private Long cpfCnpj;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private String dataNascimento;

    private String sexo;

    @NotBlank(message = "{mandatory.not.blank}")
    private String endereco;

    private String complemento;

    private int numero;

    private String bairro;
    
    private String cep;
    
    public void setCep(String cep) {
		this.cep = cep;
	}
    
    public String getCep() {
		return cep;
	}

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
}
