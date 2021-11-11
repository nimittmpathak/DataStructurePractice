package com.Basics;

//import java.lang.Exception;

public class JavaClassExDemo {
    public void test(JavaClassEx ob1, JavaClassEx ob2) throws NullPointerException {
        System.out.println("Obj1 hight: "+ob1.hight);
        System.out.println("Obj2 hight: "+ob2.hight);
        ob2.hight = 2;
        System.out.println("Obj1 hight: "+ob1.hight);
        ob1 = null;
        System.out.println("Obj2 hight: "+ob2.hight);

        System.out.println("Obj1 hight: " + ob1.hight);

    }
    public static void main(String args[]){
        JavaClassExDemo demo = new JavaClassExDemo();
        JavaClassEx jClass1 = new JavaClassEx(3,4);
        JavaClassEx jClass2 = jClass1;

        try{
            demo.test(jClass1,jClass2);
        } catch (Exception e){System.out.println(e.getMessage());}
    }
}
