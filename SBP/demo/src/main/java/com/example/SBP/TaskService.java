package com.example.SBP;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service; 

@Service  
public class TaskService {

	@Autowired  
	TaskRepository tR;  
	

	public List<Task> getAllTasks()   
		{  
			List<Task> tasks = new ArrayList<Task>();  
			tR.findAll().forEach(task -> tasks.add(task));  
			return tasks;  
		}  
	
	 
		public Task getTaskById(int id)   
		{  
			return tR.findById(id).get();  
		}  
		
		
		public void saveUpdate(Task task)   
		{  
			tR.save(task);  
		}  
		
		public void delete(int id)   
		{  
			tR.deleteById(id);  
		}  
		
		public void update(Task task, int id)   
		{  
			tR.save(task);  
		}  
		
	}

