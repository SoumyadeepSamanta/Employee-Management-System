package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	
	public void addEmp(Employee e) {
		
		repo.save(e);
	}
	
	public List<Employee> getAllEmp(){
		
		return repo.findAll();
	}
	
	public Employee getEmpById(String id) {
		
		Optional<Employee> e = repo.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(String id) {
		
		repo.deleteById(id);
	}
	
	/*public void updateEmp(String id, Employee employee) {

        Employee existingEmployee = repo.findById(id).get();
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());

        repo.save(existingEmployee);

    }*/

}
