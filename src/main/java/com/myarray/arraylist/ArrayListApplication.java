package com.myarray.arraylist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayListApplication {
    public static void main(String[] args) {
        Injection<String> stringInjection = new MyArray<>();
        stringInjection.add("Test1");
        stringInjection.add("Test2");
        stringInjection.add("Test3");
        stringInjection.add("Test4");
        stringInjection.add("Test5");
        stringInjection.add("Test6");

        /*stringInjection.delete(2);
        stringInjection.update(2, "test3");
        System.out.println(stringInjection.get(2));
        System.out.println(stringInjection.size());
        System.out.println(stringInjection.isEmpty());*/

        stringInjection.toString();
        for (String str : stringInjection){
            System.out.println(str);
        }

    }

}
