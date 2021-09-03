/**
 * 
 */
package edu.springboot.a2z.emporg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.springboot.a2z.emporg.entity.Dept;
import edu.springboot.a2z.emporg.repository.DeptRepository;

/**
 * @author NextGenAZ
 *
 */
@Service
public class DeptService {
	
	@Autowired
	private DeptRepository deptRepository;

	public List<Dept> getAllDepartments() {
		return deptRepository.findAll();
	}
	
	public Dept getDeptWithId(@PathVariable Integer deptNo) {
		return deptRepository.findById(deptNo).get();
	}
	
	public Dept createNewDepartment(@RequestBody Dept dept) {
		return deptRepository.saveAndFlush(dept);
	}
	
	public Dept modifyDept(@RequestBody Dept dept) {
		return deptRepository.save(dept);
	}
	
	public Dept updatePartial(Dept dept) {
		return deptRepository.saveAndFlush(dept);
	}
	
	public void removeDeptWithId(@PathVariable Integer deptNo) {
		deptRepository.deleteById(deptNo);
	}
}
