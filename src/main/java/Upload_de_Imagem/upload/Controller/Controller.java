package Upload_de_Imagem.upload.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Upload_de_Imagem.upload.DTO.Upload;
import Upload_de_Imagem.upload.Model.UploadModel;
import Upload_de_Imagem.upload.Service.UploadService;

@RestController
@RequestMapping("/upload")
public class Controller {

    private final UploadService uploadService;

    public Controller(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<UploadModel> UploadImage(
            @RequestPart("upload") Upload upload,
            @RequestPart("arquivo") MultipartFile arquivo) {

        UploadModel salvo = uploadService.Salvar(upload, arquivo);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

}
