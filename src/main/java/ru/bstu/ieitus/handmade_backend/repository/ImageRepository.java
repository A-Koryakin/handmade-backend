package ru.bstu.ieitus.handmade_backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.ieitus.handmade_backend.entity.domain.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {
}
