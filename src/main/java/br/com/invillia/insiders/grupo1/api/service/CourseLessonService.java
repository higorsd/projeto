package br.com.invillia.insiders.grupo1.api.service;

import br.com.invillia.insiders.grupo1.domain.model.Course_Lesson;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseLessonService {

    public ResponseEntity<?> getById(Long id) {
        return ResponseEntity.ok(create(id));
    }

    private ResponseEntity<?> create(Long id) {

        return ResponseEntity.ok(new Course_Lesson(
                1,
                "Aula 1: Introdução",
                5.00
        ));
    }
}
