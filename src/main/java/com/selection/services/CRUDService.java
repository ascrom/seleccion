package com.selection.services;

import java.util.List;

/**
 * Created by ascrom on 16/11/16.
 */
public interface CRUDService<T> {
    List<?> listAll();

    T getById(Long id);

    T saveOrUpdate(T domainObject);

    void delete(Long id);
}
