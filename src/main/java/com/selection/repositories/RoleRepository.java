package com.selection.repositories;

import com.selection.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ascrom on 16/11/16.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

}
