package com.example.SBP;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  



@RestController  
public class TaskController   {  
	//autowire the BooksService class  
	@Autowired  
	TaskService ts;  
	
	@GetMapping("/task")  
	private List<Task> getAllTasks()   
	{  
		return ts.getAllTasks();  
	}  
	
	@GetMapping("/task/{id}")  
	private Task getTaskById(@PathVariable("id") int id)   
	{  
		return ts.getTaskById(id);  
	}  
	

	@DeleteMapping("/task/{id}")  
	private void deleteTask(@PathVariable("id") int id)   
	{  
		ts.delete(id);  
	}  
	
	@PostMapping("/task")  
	private int saveTask(@RequestBody Task task)   
	{  
		ts.saveUpdate(task);  
		return task.getId();  
	}  
	
	@PutMapping("/task")  
	private Task update(@RequestBody Task task)   
	{  
		ts.saveUpdate(task);  
		return task;  
	}  
}  