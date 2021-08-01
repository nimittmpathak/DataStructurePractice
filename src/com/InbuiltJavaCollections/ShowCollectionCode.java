package com.InbuiltJavaCollections;

import javax.swing.text.SimpleAttributeSet;
import java.io.*;
import java.util.*;


public class ShowCollectionCode<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        Student A = new Student(1,"Nimitt Pathak");
        Student B = new Student(2,"Jahanvi Pathak");
        Student C = new Student(3,"Jahnavi Vyas");
        Student D = new Student(3,"Jahnavi Vyas");

        ArrayList<Student> StudentList = new ArrayList<Student>();
        StudentList.add(A);
        StudentList.add(B);
        StudentList.add(C);

        int i = 0;
        for(Student s: StudentList){
            System.out.println(StudentList.get(i).name);
            i++;
        }

        //D.name = "Different Name";




        if(StudentList.contains(D)){
            C.name = D.name;
        }
        else {
            System.out.println("Object can't find");
        }
        ArrayList<String> NameList = new ArrayList<String>();
        ArrayList<String> CopyNameList = new ArrayList<String>();

        for(Student s: StudentList){
            NameList.add(s.name);
        }
        for(Student g: StudentList){
            CopyNameList.add(g.name);
        }

        if (NameList.containsAll(CopyNameList)){
            System.out.println("Matched the collection");
        } else {
            System.out.println("Unmatched");
        }


    }
}

