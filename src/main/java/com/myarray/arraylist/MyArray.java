package com.myarray.arraylist;

import java.util.Iterator;

public class MyArray<T> implements Injection<T>{
    private T[] values;
    public MyArray() {
        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length+1];
            System.arraycopy(temp,0, values, 0, temp.length);
            values[values.length-1] = t;
            return true;
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            T [] temp = values;
            values = (T []) new Object[temp.length-1];
            System.arraycopy(temp, 0, values, 0, index);    //берем temp, копируем с нулевого элемента, копируем в values, копируем с 0 элемента и до индекса
            System.arraycopy(temp, index+1, values, index,temp.length-index-1);
        } catch (ClassCastException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    @Override
    public boolean isEmpty() {
        return (values.length == 0);
    }

    /*@Override
    public T[] increaseTheSize() {
        T[] temp = (T[]) new Object[(values.length * 2)];  //создаем новый массив большего размера
        System.arraycopy(temp, 0, values, 0, values.length);  //копируем в новый массив элементы из старого массива
        return values;
    }*/

    @Override
    public Iterator<T> iterator() {
        return new IteratorMyArray<>(values);
    }
}
