package Upload_de_Imagem.upload.DTO;

public class Upload {
    private String nomeProduto;
    private String descricaoProduto;
    private Double precoProduto;
    private String categoriaProduto;
    private int quantidadeProduto;
    private String imagemProduto;
    
    public Upload() {
    }

    public Upload(String nomeProduto, String descricaoProduto, Double precoProduto, String categoriaProduto,
            int quantidadeProduto, String imagemProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.imagemProduto = imagemProduto;
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
