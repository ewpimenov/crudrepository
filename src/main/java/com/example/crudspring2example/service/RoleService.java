package com.example.crudspring2example.service;


import com.example.crudspring2example.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRolesByName();

    List<Role> getRolesByName(String[] role);
}
