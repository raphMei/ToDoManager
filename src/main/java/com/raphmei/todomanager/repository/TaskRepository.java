package com.raphmei.todomanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.raphmei.todomanager.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
