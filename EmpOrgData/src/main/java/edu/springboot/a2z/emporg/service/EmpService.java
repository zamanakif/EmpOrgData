/**
 * 
 */
package edu.springboot.a2z.emporg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.springboot.a2z.emporg.entity.Emp;
import edu.springboot.a2z.emporg.repository.EmpRepository;

/**
 * @author NextGenAZ
 *
 */
@Service
public class EmpService {
	@Autowired
	private EmpRepository empRepository;
	
	public List<Emp> getAllEmployees() {
		return empRepository.findAll();
	}
	
	public Emp getEmployeeById(Integer empNo) {
		return empRepository.findById(empNo).get();
	}
	
	public List<Emp> getAllEmployeesUnderMgrId(Integer mgrId) {
		return empRepository.findAllEmpUnderMgrNative(mgrId);
	}
	
	public List<Emp> getEmpByFirstName(String eName) {
		return empRepository.findByEName(eName);
	}
	
	public List<Emp> getEmpByNameMatches(String eName) {
		return empRepository.findByENameLike(eName);
	}
	
	public List<Emp> getEmpByJob(String job) {
		return empRepository.findByJob(job);
	}
	
	public List<Emp> getEmpWithSalAbove(Float limit) {
		return empRepository.findBySalaryGreaterThan(limit);
	}
	
	public List<Emp> getNEmpWithSalAbove(Float limit, Integer count) {
		return empRepository.findNEmpBySalaryGreaterThan(limit, count);
	}
	
	public List<Emp> getEmpWithSalBelow(Float limit) {
		return empRepository.findBySalaryLessThanEqual(limit);
	}
}
