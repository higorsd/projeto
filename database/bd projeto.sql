CREATE TABLE course_lesson(
    id int primary key not null,
  course_id int not null,
  title varchar(255) not null,
  duration float(50) not null,
    created_at date,
    updated_at date,
    FOREIGN KEY (course_id) REFERENCES course(id)
);