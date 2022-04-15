package com.example.onlineMagazin.service.fileUpload;

import com.example.onlineMagazin.dto.file.FileDto;
import com.example.onlineMagazin.dto.file.FileUploadDto;
import com.example.onlineMagazin.dto.filter.FilterDto;
import com.example.onlineMagazin.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileUploadService implements BaseService {
    private final String FILE_UPLOAD_PRODUCT_PATH = "D:\\Unicorn\\Spring-boot\\onlineShop\\v1_site\\src\\main\\resources\\static\\images\\upload\\product";
    private final String FILE_UPLOAD_USER_PATH = "D:\\Unicorn\\Spring-boot\\onlineShop\\v1_site\\src\\main\\resources\\static\\images\\upload\\user";

    public FileUploadService() {
    }

    public ResponseEntity<FileDto> saveProduct(MultipartFile file) {
        try {
            String org_name = file.getOriginalFilename();
            String extension = StringUtils.getFilenameExtension(org_name);
            String generatedName = System.currentTimeMillis() + "." + extension;
            Files.copy(file.getInputStream(), Paths.get(FILE_UPLOAD_PRODUCT_PATH, generatedName), StandardCopyOption.REPLACE_EXISTING);
            return new ResponseEntity<>(new FileDto(generatedName, "upload/product/" + generatedName), HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResponseEntity<FileDto> saveUser(MultipartFile file) {
        try {
            String org_name = file.getOriginalFilename();
            String extension = StringUtils.getFilenameExtension(org_name);
            String generatedName = System.currentTimeMillis() + "." + extension;
            Files.copy(file.getInputStream(), Paths.get(FILE_UPLOAD_USER_PATH, generatedName), StandardCopyOption.REPLACE_EXISTING);
            return new ResponseEntity<>(new FileDto(generatedName, "upload/user/" + generatedName), HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
