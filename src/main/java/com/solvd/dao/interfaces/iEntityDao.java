package com.solvd.dao.interfaces;

public interface iEntityDao <T>{
    public void save (T t);
    public T getById(long id);
}
