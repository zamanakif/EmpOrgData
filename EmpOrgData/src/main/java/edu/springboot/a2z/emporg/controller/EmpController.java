package edu.springboot.a2z.emporg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.a2z.emporg.entity.Emp;
import edu.springboot.a2z.emporg.repository.EmpRepository;
import edu.springboot.a2z.emporg.service.EmpService;

@RestController
@RequestMapping("/org")
public class EmpController {
	@Autowired
	private EmpService empService;

	@GetMapping("/emps")
	public List<Emp> getAllEmp() {
		return empService.getAllEmployees();
	}
	
	@GetMapping("/emps/{empNo}")
	public Emp getEmp(@PathVariable Integer empNo) {
		return empService.getEmployeeById(empNo);
	}
	
	@GetMapping("/emps/{mgrId}/allEmps")
	public List<Emp> getAllEmp(@PathVariable Integer mgrId) {
		return empService.getAllEmployeesUnderMgrId(mgrId);
	}
	
	@GetMapping("/emps/name/{eName}")
	public List<Emp> getEmpByFirstName(@PathVariable String eName) {
		return empService.getEmpByFirstName(eName);
	}
	
	@GetMapping("/emps/namematches/{eName}")
	public List<Emp> getEmpByNameMatches(@PathVariable String eName) {
		return empService.getEmpByNameMatches(eName);
	}
	
	@GetMapping("/emps/title/{job}")
	public List<Emp> getEmpByJob(@PathVariable String job) {
		return empService.getEmpByJob(job);
	}
	
	@GetMapping("/emps/salaryabove/{limit}")
	public List<Emp> getEmpWithSalAbove(@PathVariable Float limit) {
		return empService.getEmpWithSalAbove(limit);
	}
	@GetMapping("/nemps/salaryabove/{limit}")
	public List<Emp> getNEmpWithSalAbove(@PathVariable Float limit, @RequestParam Integer count) {
		return empService.getNEmpWithSalAbove(limit, count);
	}
	
	@GetMapping("/emps/salarybelow/{limit}")
	public List<Emp> getEmpWithSalBelow(@PathVariable Float limit) {
		return empService.getEmpWithSalBelow(limit);
	}
}
