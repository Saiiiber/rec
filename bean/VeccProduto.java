package bean;
// Generated 17/10/2023 09:56:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VeccProduto generated by hbm2java
 */
@Entity
@Table(name="vecc_produto"
    ,catalog="db_victor_cardoso"
)
public class VeccProduto  implements java.io.Serializable {


     private int idveccProduto;
     private VeccVendedor veccVendedor;
     private String veccCodigo;
     private String veccNome;
     private String veccQuantidade;
     private String veccDescricao;
     private String veccPreco;
     private Set veccVendaProdutos = new HashSet(0);

    public VeccProduto() {
    }

	
    public VeccProduto(int idveccProduto, VeccVendedor veccVendedor) {
        this.idveccProduto = idveccProduto;
        this.veccVendedor = veccVendedor;
    }
    public VeccProduto(int idveccProduto, VeccVendedor veccVendedor, String veccCodigo, String veccNome, String veccQuantidade, String veccDescricao, String veccPreco, Set veccVendaProdutos) {
       this.idveccProduto = idveccProduto;
       this.veccVendedor = veccVendedor;
       this.veccCodigo = veccCodigo;
       this.veccNome = veccNome;
       this.veccQuantidade = veccQuantidade;
       this.veccDescricao = veccDescricao;
       this.veccPreco = veccPreco;
       this.veccVendaProdutos = veccVendaProdutos;
    }
   
     @Id 

    
    @Column(name="idvecc_produto", unique=true, nullable=false)
    public int getIdveccProduto() {
        return this.idveccProduto;
    }
    
    public void setIdveccProduto(int idveccProduto) {
        this.idveccProduto = idveccProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vecc_fk_vendedor", nullable=false)
    public VeccVendedor getVeccVendedor() {
        return this.veccVendedor;
    }
    
    public void setVeccVendedor(VeccVendedor veccVendedor) {
        this.veccVendedor = veccVendedor;
    }

    
    @Column(name="vecc_codigo", length=45)
    public String getVeccCodigo() {
        return this.veccCodigo;
    }
    
    public void setVeccCodigo(String veccCodigo) {
        this.veccCodigo = veccCodigo;
    }

    
    @Column(name="vecc_nome", length=45)
    public String getVeccNome() {
        return this.veccNome;
    }
    
    public void setVeccNome(String veccNome) {
        this.veccNome = veccNome;
    }

    
    @Column(name="vecc_quantidade", length=45)
    public String getVeccQuantidade() {
        return this.veccQuantidade;
    }
    
    public void setVeccQuantidade(String veccQuantidade) {
        this.veccQuantidade = veccQuantidade;
    }

    
    @Column(name="vecc_descricao", length=45)
    public String getVeccDescricao() {
        return this.veccDescricao;
    }
    
    public void setVeccDescricao(String veccDescricao) {
        this.veccDescricao = veccDescricao;
    }

    
    @Column(name="vecc_preco", length=45)
    public String getVeccPreco() {
        return this.veccPreco;
    }
    
    public void setVeccPreco(String veccPreco) {
        this.veccPreco = veccPreco;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="veccProduto")
    public Set getVeccVendaProdutos() {
        return this.veccVendaProdutos;
    }
    
    public void setVeccVendaProdutos(Set veccVendaProdutos) {
        this.veccVendaProdutos = veccVendaProdutos;
    }




}


