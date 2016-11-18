package com.selection.repositories;

import com.selection.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ascrom on 16/11/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String userName);
}
