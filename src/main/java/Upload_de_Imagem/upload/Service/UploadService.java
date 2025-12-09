package Upload_de_Imagem.upload.Service;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Upload_de_Imagem.upload.DTO.Upload;
import Upload_de_Imagem.upload.Exceptions.Obrigatorio;
import Upload_de_Imagem.upload.Model.UploadModel;
import Upload_de_Imagem.upload.Repository.Repository;

@Service
public class UploadService {
    private final Repository repository;
    
    public UploadService(Repository repository) {
        this.repository = repository;
    }
    public UploadModel Salvar(Upload upload, MultipartFile arquivo){

        if(upload.getNomeProduto().isEmpty()){
            throw new Obrigatorio("Nome do produto é obrigatório");
        }
        else if(upload.getCategoriaProduto().isEmpty()){
            throw new Obrigatorio("Categoria do produto é obrigatório");
        }
        else if(arquivo.isEmpty()){
            throw new Obrigatorio("Arquivo é obrigatório");
        }
        else if(upload.getDescricaoProduto().isEmpty()){
            throw new Obrigatorio("Descrição do produto é obrigatória");
        }
        else if(upload.getPrecoProduto() == null){
            throw new Obrigatorio("Preço do produto é obrigatório");
        }
        else if(upload.getQuantidadeProduto() <= 0){
            throw new Obrigatorio("Quantidade do produto é obrigatória");
        }
       String original = arquivo.getOriginalFilename();
      if (original == null) {
          throw new Obrigatorio("Nome do arquivo inválido");
      }
       String lower = original.toLowerCase();
       if (!(lower.endsWith(".jpeg") || lower.endsWith(".jpg") || lower.endsWith(".png"))) {
            throw new Obrigatorio("Formato de imagem inválido");
       }
     // Criar pasta de uploads no diretório do projeto (ou home do usuário se preferir)
       File pastaDownloads = new File(System.getProperty("user.home"), "uploads");
       if (!pastaDownloads.exists()) {
            pastaDownloads.mkdirs(); // mkdirs cria pastas pai também se necessário
       }
       String nomeDoArquivo = UUID.randomUUID().toString() + "_" + original;
       File destino = new File(pastaDownloads, nomeDoArquivo);
            try{
                arquivo.transferTo(destino);
            }catch(Exception e){
                throw new RuntimeException("Falha ao salvar arquivo: " + e.getMessage(), e);
            }

       UploadModel uploadModel = new UploadModel();
        uploadModel.setNomeProduto(upload.getNomeProduto());
        uploadModel.setDescricaoProduto(upload.getDescricaoProduto());
        uploadModel.setPrecoProduto(upload.getPrecoProduto());
        uploadModel.setCategoriaProduto(upload.getCategoriaProduto());
        uploadModel.setQuantidadeProduto(upload.getQuantidadeProduto());
        uploadModel.setImagemProduto(destino.getPath());
        repository.save(uploadModel);
            return uploadModel;
        
    }
    
}
