package ru.bstu.ieitus.handmade_backend.web.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.bstu.ieitus.handmade_backend.entity.domain.Photolesson;
import ru.bstu.ieitus.handmade_backend.service.PhotolessonService;

import java.util.List;

@RestController
public class PhotolessonController {
    @Autowired
    PhotolessonService photolessonService;

    @GetMapping("/getlast")
    public List<Photolesson> getLast(@RequestParam Long count){
        return photolessonService.getLast(count);
    }

    @PostMapping()
    public Photolesson create(@RequestBody Photolesson photolesson){
        return photolessonService.create(photolesson);
    }
}
