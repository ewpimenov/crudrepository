package com.example.crudspring2example.service;


import com.example.crudspring2example.model.Role;
import com.example.crudspring2example.repository.RoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    @Transactional
    public List<Role> getAllRolesByName() {
        return roleRepository.findAll();
    }

    @Override
    @Transactional
    public List<Role> getRolesByName(String[] role) {
        return roleRepository.findAll(role);
    }
}
