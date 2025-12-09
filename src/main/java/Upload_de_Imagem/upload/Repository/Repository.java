package Upload_de_Imagem.upload.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Upload_de_Imagem.upload.Model.UploadModel;

public interface Repository extends JpaRepository<UploadModel, Long> {

    
}
