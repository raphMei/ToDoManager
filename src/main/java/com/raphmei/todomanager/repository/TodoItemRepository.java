package com.raphmei.todomanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.raphmei.todomanager.model.TodoItem;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
