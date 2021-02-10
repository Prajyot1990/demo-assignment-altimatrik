package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonInfo;
import com.example.demo.entity.TaskData;

@Repository
public interface TaskRepository extends JpaRepository<TaskData,Long>{

}
