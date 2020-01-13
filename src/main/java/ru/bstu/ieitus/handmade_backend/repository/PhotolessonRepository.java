package ru.bstu.ieitus.handmade_backend.repository;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.ieitus.handmade_backend.entity.domain.Photolesson;

import java.util.List;

@Repository
public interface PhotolessonRepository extends CrudRepository<Photolesson, Long> {
    @Query(value = "select ph from Photolesson ph order by ph.id desc limit :count", nativeQuery = true)
    List<Photolesson> findLast(Long count);
}
