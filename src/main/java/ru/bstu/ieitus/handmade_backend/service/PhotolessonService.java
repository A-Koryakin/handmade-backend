package ru.bstu.ieitus.handmade_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bstu.ieitus.handmade_backend.entity.domain.Photolesson;
import ru.bstu.ieitus.handmade_backend.repository.PhotolessonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PhotolessonService {
    @Autowired
    PhotolessonRepository photolessonRepository;

    public List<Photolesson> getLast(Long count){
        return photolessonRepository.findLast(count);
    }

    public Photolesson create(Photolesson photolesson){
        return photolessonRepository.save(photolesson);
    }

    public Photolesson getById(Long id){
        return photolessonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Фотоурок с id="+id+" не найден"));
    }

    public Photolesson update(Photolesson photolesson){
        Photolesson updatedPhotolesson = photolessonRepository.findById(photolesson.getId())
                .orElseThrow(() -> new RuntimeException("Фотоурок не найден"));

        updatedPhotolesson.setTitle(photolesson.getTitle());
        updatedPhotolesson.setDescription(photolesson.getDescription());
        updatedPhotolesson.setMaterials(photolesson.getMaterials());
        updatedPhotolesson.setCountImages(photolesson.getCountImages());
        updatedPhotolesson.setUserID(photolesson.getUserID());
        updatedPhotolesson.setHandmadeTypeID(photolesson.getHandmadeTypeID());

        return photolessonRepository.save(updatedPhotolesson);
    }
}
