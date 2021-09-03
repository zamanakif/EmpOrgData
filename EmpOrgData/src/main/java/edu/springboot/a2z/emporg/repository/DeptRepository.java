package edu.springboot.a2z.emporg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.springboot.a2z.emporg.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {
}
