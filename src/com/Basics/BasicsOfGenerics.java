package com.Basics;

public class BasicsOfGenerics <T> {
    T ob;
    public BasicsOfGenerics(T o){
        this.ob = o;
    }
    public T getOb(){
        return this.ob;
    }
    public String getType(){
        return ob.getClass().getName();
    }
}
