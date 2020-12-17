DROP TABLE IF EXISTS TASK;
CREATE TABLE Task (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  task_description VARCHAR(250) DEFAULT NULL,
  status VARCHAR(250) DEFAULT NULL
);
INSERT INTO Task (name, task_description, status) VALUES
  ('Tarea 1', 'A', 'Pendiente'),
  ('Tarea 2', 'B', 'En progreso'),
  ('Tarea 3', 'C', 'Finalizada');