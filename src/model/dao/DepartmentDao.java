package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
<<<<<<< HEAD
	void deleteById(Integer id);
=======
	void deleteByid(Integer id);
>>>>>>> b6df7b0f985908b6b4d53d7987b195569ee4df0f
	Department findById(Integer id);
	List<Department> findAll();	
}
