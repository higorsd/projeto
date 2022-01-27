package br.com.invillia.insiders.grupo1.api.controller;

import br.com.invillia.insiders.grupo1.api.service.CourseLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course/lesson")
public class CourseLessonController {

    @Autowired
    private CourseLessonService courseLessonService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(name="id") Long id) {
        return courseLessonService.getById(id);
    }




}
