package ru.bstu.ieitus.handmade_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bstu.ieitus.handmade_backend.entity.domain.Image;
import ru.bstu.ieitus.handmade_backend.repository.ImageRepository;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepository;

    public Image create(Image image){
        return imageRepository.save(image);
    }
}
