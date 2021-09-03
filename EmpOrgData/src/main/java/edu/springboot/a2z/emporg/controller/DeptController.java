/**
 * 
 */
package edu.springboot.a2z.emporg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.a2z.emporg.entity.Dept;
import edu.springboot.a2z.emporg.repository.DeptRepository;
import edu.springboot.a2z.emporg.service.DeptService;
//import edu.springboot.a2z.repository.DeptRepository;

/**
 * @author NextGenAZ
 *
 */
@RestController
@RequestMapping("/org")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	@GetMapping("/depts")
	public List<Dept> getAllDept() {
		return deptService.getAllDepartments();
	}
	
	@GetMapping("/depts/{deptNo}")
	public Dept getDept(@PathVariable Integer deptNo) {
		return deptService.getDeptWithId(deptNo);
	}
	
	@PostMapping("/depts")
	public Dept createDept(@RequestBody Dept dept) {
		return deptService.createNewDepartment(dept);
	}
	
	@PatchMapping("/depts/{deptNo}")
	public Dept updatePartialDept(@RequestBody Dept dept) {
		return deptService.updatePartial(dept);
	}
	
	@PutMapping("/depts/{deptNo}")
	public Dept updateDept(@RequestBody Dept dept) {
		return deptService.modifyDept(dept);
	}
	
	
	
	
	@DeleteMapping("/depts/{deptNo}")
	public void deleteDept(@PathVariable Integer deptNo) {
		deptService.removeDeptWithId(deptNo);
	}
	
	/*
	{
	"deptNo": 50,
	"location": "PHILADELPHIA",
	"dname": "Testing"
	}
	 */
	
	
}
