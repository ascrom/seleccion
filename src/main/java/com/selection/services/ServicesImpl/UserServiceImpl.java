package com.selection.services.ServicesImpl;

import com.selection.models.User;
import com.selection.repositories.UserRepository;
import com.selection.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ascrom on 16/11/16.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<?> listAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User saveOrUpdate(User domainObject) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
