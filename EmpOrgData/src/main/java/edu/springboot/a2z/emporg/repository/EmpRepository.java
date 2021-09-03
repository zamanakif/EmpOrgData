package edu.springboot.a2z.emporg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.springboot.a2z.emporg.entity.Emp;

@Repository
public interface EmpRepository  extends JpaRepository<Emp, Integer> {
	@Query(value = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from scott.emp where mgr = :mgrId", nativeQuery = true)
	public List<Emp> findAllEmpUnderMgrNative(Integer mgrId);
	
	//Compilation Error:
	//Invalid derived query. No property firstName found for type Emp!
	//public List<Emp> findByFirstNameLike(String fName);
	
	public List<Emp> findByEName(String eName);
	
	public List<Emp> findByENameLike(String eName);
	
	public List<Emp> findByJob(String job);
	
	public List<Emp> findBySalaryGreaterThan(Float limit);
	
	@Query(value = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from scott.emp where sal >= :limit order by sal asc limit :count", nativeQuery = true)
	public List<Emp> findNEmpBySalaryGreaterThan(Float limit, Integer count);
	
	public List<Emp> findBySalaryLessThanEqual(Float limit);
}
