package com.image_uploader.image_uploader.services;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageUploader {
    String uploadImage(MultipartFile image);

    List<String> allFiles();

    String preSignedUrl(String fileName);

    String getImageURLByName(String fileName);

}
