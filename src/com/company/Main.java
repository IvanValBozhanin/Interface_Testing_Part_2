package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        Test1();
        Test2();
    }

    public static void Test2(){
        GeometricObject [] al = new GeometricObject[5];
        for(int i = 4; i >= 0; -- i){
            al[i] = (GeometricObject) new Triangle(i+1, i+2, i+3);
        }
        System.out.println(sumArea(al));

        GeometricObject [] all = new GeometricObject[5];
        for(int i = 4; i >= 0 ; -- i){
            all[i] = new Square(i + 1);
        }
        System.out.println(sumArea(all));
    }

    public static double sumArea(GeometricObject[] a){
        double s = 0.0;
        for (GeometricObject g :
                a) {
            s += g.getArea();
        }
        return s;
    }

    public static void Test1(){
        System.out.println(((Square)GeometricObject.max(new Square(4), new Square(5))).getSide());
        System.out.println(((Triangle)GeometricObject.max(new Triangle(2,3,4), new Triangle(5,4,5))).printTriangle());
        System.out.println();
        ArrayList<Triangle> al = new ArrayList<>();
        for(int i = 5; i > 0; -- i){
            al.add(new Triangle(i+1, i+2, i+3));
        }
        Collections.sort(al);
        for(int i=0;i<5;++i){
            System.out.println(al.get(i).printTriangle());
        }
    }
}
