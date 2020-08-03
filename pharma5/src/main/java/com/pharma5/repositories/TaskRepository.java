package com.pharma5.repositories;

import java.util.List;

import com.pharma5.entities.Task;
import com.pharma5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
}
