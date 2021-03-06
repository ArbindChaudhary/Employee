package net.codejava.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class EmployeeService {
	@Autowired
private EmployeeRepository repo;

	public List<Employee> listAll(){
		return repo.findAll();
		
		
	}
	public void save(Employee employee) {
		repo.save(employee);
		
	}
	public Employee get(Long id) {
		return repo.findById(id).get();
			
	}
	
	public void deletde(Long id) {
		repo.deleteById(id);
		
	}
}
