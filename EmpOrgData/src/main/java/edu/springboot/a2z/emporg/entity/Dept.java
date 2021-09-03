/**
 * 
 */
package edu.springboot.a2z.emporg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author NextGenAZ
 *
 */
@Entity
@Table(name="dept")
public class Dept {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY/AUTO
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "deptno")
	private Integer deptNo;//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "dname")
	private String dName;
	
	@Column(name = "loc")
	private String location;
	
	public Dept() {
		super();
	}

	public Dept(Integer deptNo, String dName, String loc) {
		this.deptNo = deptNo;
		this.dName = dName;
		this.location = loc;
	}
	
	/*
	public Dept(String dName, String loc) {
		this.dName = dName;
		this.location = loc;
	}
	*/
	
	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
