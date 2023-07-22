package com.dailycodebuffer.departmentservice.repository;

import com.dailycodebuffer.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private List<Department> departaments = new ArrayList<>();

    public Department addDepartment(Department department){
        departaments.add(department);

        return department;
    }

    public Department findById(Long id){
        return departaments.stream()
                .filter(department -> department.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    public List<Department> findAll(){
        return departaments;
    }

}
