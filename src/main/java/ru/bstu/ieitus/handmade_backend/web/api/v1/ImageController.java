package ru.bstu.ieitus.handmade_backend.web.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.bstu.ieitus.handmade_backend.entity.domain.Image;
import ru.bstu.ieitus.handmade_backend.repository.ImageRepository;
import ru.bstu.ieitus.handmade_backend.service.ImageService;

@RestController
public class ImageController {
    @Autowired
    ImageService imageService;

    @PostMapping
    Image create(@RequestBody Image image){
        return imageService.create(image);
    }
}
