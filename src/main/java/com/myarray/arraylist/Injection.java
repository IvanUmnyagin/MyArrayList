package com.myarray.arraylist;

public interface Injection<T> extends Iterable<T>{
    boolean add(T t);
    void delete(int index);
    T get(int index);
    int size();
    void update(int index, T t);
    boolean isEmpty();
    /*T[] increaseTheSize();*/
}
