package com.example.equalsandtostring;

public class EqualsToStringMain {
    public static void main(String args[]){
        Student s1 = new Student(8888,"ahmet");
        Student s2 = new Student(7777,"mehmet");
        Student s3 = new Student(4444,"zeynep");
        Student s4 = new Student(5555,"ahmet");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        if (s1.equals(s4)){
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }

    }

}
