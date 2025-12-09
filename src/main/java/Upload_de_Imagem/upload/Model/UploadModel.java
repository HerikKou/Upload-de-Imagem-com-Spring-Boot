package Upload_de_Imagem.upload.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UploadModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private String descricaoProduto;
    private Double precoProduto;
    private String categoriaProduto;
    private int quantidadeProduto;
    private String imagemProduto;
    public UploadModel() {
    }
    public UploadModel(Long id, String nomeProduto, String descricaoProduto, Double precoProduto,
            String categoriaProduto, int quantidadeProduto, String imagemProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.imagemProduto = imagemProduto;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public Double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public String getCategoriaProduto() {
        return categoriaProduto;
    }
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    public String getImagemProduto() {
        return imagemProduto;
    }
    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }
    
    
}
