package com.example.SBP;
import javax.persistence.*;

@Entity
@Table(name="TASK")

public class Task { 
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column
	   private int id;
	   
	   @Column 
	   private String name;
	  
	   @Column 
	   private String task_description;
	   
	   @Column 
	   private String status;

	   public Task() {
	       
	   }
	   public Task(Integer id, String nT, String dT, String e) {
	      super();
	      this.id = id;
	      this.name = nT;
	      this.task_description = dT;
	      this.status = e;
	   }
	    
	  
	 
	   public int getId() {
		return id;
	   }
	   
	   public void setId(int id) {
		this.id = id;
	   }
	   
	   public String getName() {
		return name;
	   }
	   
	   public void setNombreTarea(String nombreTarea) {
		this.name = nombreTarea;
	   }
	   
	   public String getDescripcionTarea() {
		return task_description;
	   }
	   
	   public void setDescripcionTarea(String descripcionTarea) {
		this.task_description = descripcionTarea;
	   }
	   
	   public String getEstado() {
		return status;
	   }
	   
	   public void setEstado(String estado) {
		this.status = estado;
	   }
	   
	@Override
	   public String toString() {
	      return "Tarea: id=" + id + ", nombreTarea=" + name
	            + ", descripcionTarea=" + task_description + ", estado=" + status;
	   }
}
