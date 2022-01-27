package br.com.invillia.insiders.grupo1.api.service;

import br.com.invillia.insiders.grupo1.domain.enumerator.Category;
import br.com.invillia.insiders.grupo1.domain.enumerator.CourseStatus;
import br.com.invillia.insiders.grupo1.domain.model.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    public ResponseEntity<?> getById(Long id) {
        return ResponseEntity.ok(create(id));
    }

    private ResponseEntity<?> create(Long id) {

        return ResponseEntity.ok(new Course(
                Category.FRONTEND,
                12.00,
                CourseStatus.TO_WATCH
        ));
    }



}
