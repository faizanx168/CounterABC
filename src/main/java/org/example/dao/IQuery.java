package org.example.dao;

import java.util.List;

public interface IQuery <T>{
    List<T> findAll();

}
