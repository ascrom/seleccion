package com.selection.services.ServicesImpl;

import com.selection.models.Role;
import com.selection.repositories.RoleRepository;
import com.selection.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ascrom on 16/11/16.
 */
@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<?> listAll() {
        List<Role> roleList = new ArrayList<>();
        roleRepository.findAll().forEach(roleList::add);
        return roleList;
    }

    @Override
    public Object getById(Long id) {
        return roleRepository.findOne(id);
    }

    @Override
    public Object saveOrUpdate(Object domainObject) {
        return roleRepository.save((Role)domainObject);
    }

    @Override
    public void delete(Long id) {
        roleRepository.delete(id);
    }
}
