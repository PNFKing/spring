package com.turing.sb3.Service;

import com.turing.sb3.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpService extends JpaRepository<Emp,Integer> {
}
