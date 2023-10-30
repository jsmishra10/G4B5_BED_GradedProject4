package com.greatlearning.employee_management.service;

import com.greatlearning.employee_management.dao.RoleRepository;
import com.greatlearning.employee_management.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;


    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
