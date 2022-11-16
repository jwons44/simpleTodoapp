package com.jungwon.todoapp.repository;

import com.jungwon.todoapp.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> { // <Entity 클래스/Entity 클래스가 갖고 있는 @Id의 타입 적어주기>
}
