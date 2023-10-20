package bean;
// Generated 17/10/2023 09:56:29 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VeccEntrega generated by hbm2java
 */
@Entity
@Table(name="vecc_entrega"
    ,catalog="db_victor_cardoso"
)
public class VeccEntrega  implements java.io.Serializable {


     private int idveccEntrega;
     private String veccEndereco;
     private String veccData;
     private String veccCidade;
     private String veccNomecliente;
     private String veccIdpedido;

    public VeccEntrega() {
    }

	
    public VeccEntrega(int idveccEntrega) {
        this.idveccEntrega = idveccEntrega;
    }
    public VeccEntrega(int idveccEntrega, String veccEndereco, String veccData, String veccCidade, String veccNomecliente, String veccIdpedido) {
       this.idveccEntrega = idveccEntrega;
       this.veccEndereco = veccEndereco;
       this.veccData = veccData;
       this.veccCidade = veccCidade;
       this.veccNomecliente = veccNomecliente;
       this.veccIdpedido = veccIdpedido;
    }
   
     @Id 

    
    @Column(name="idvecc_entrega", unique=true, nullable=false)
    public int getIdveccEntrega() {
        return this.idveccEntrega;
    }
    
    public void setIdveccEntrega(int idveccEntrega) {
        this.idveccEntrega = idveccEntrega;
    }

    
    @Column(name="vecc_endereco", length=45)
    public String getVeccEndereco() {
        return this.veccEndereco;
    }
    
    public void setVeccEndereco(String veccEndereco) {
        this.veccEndereco = veccEndereco;
    }

    
    @Column(name="vecc_data", length=45)
    public String getVeccData() {
        return this.veccData;
    }
    
    public void setVeccData(String veccData) {
        this.veccData = veccData;
    }

    
    @Column(name="vecc_cidade", length=45)
    public String getVeccCidade() {
        return this.veccCidade;
    }
    
    public void setVeccCidade(String veccCidade) {
        this.veccCidade = veccCidade;
    }

    
    @Column(name="vecc_nomecliente", length=45)
    public String getVeccNomecliente() {
        return this.veccNomecliente;
    }
    
    public void setVeccNomecliente(String veccNomecliente) {
        this.veccNomecliente = veccNomecliente;
    }

    
    @Column(name="vecc_idpedido", length=45)
    public String getVeccIdpedido() {
        return this.veccIdpedido;
    }
    
    public void setVeccIdpedido(String veccIdpedido) {
        this.veccIdpedido = veccIdpedido;
    }




}

