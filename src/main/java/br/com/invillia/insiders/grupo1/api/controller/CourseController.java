package br.com.invillia.insiders.grupo1.api.controller;

import br.com.invillia.insiders.grupo1.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    // Teste para primeiro commit
    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(name="id") Long id) {
        return courseService.getById(id);
    }

}
