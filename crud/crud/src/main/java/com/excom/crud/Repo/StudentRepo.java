package com.excom.crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.excom.crud.Model.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
