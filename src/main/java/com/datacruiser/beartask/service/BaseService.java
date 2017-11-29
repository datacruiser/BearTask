package com.datacruiser.beartask.service;

public interface BaseService<T> {
    void add(T t) throws Exception;
    void del(T t) throws Exception;
    void update(T t) throws Exception;
}
