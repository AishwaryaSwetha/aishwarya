package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Myrectangle rec = new Myrectangle(10, 5);
        Mycircle cir = new Mycircle(4);
        List<Ishape> myshapelist = new ArrayList<>();
        myshapelist.add(rec);
        myshapelist.add(cir);
        for (Ishape shape : myshapelist) {
            System.out.println("area is " + shape.getArea() + "perimeter is" + shape.getPerimeter());

        }
        Ishape nextshape = new Myrectangle(10, 30);
        System.out.println("area is " + nextshape.getArea() + "perimeter is" + nextshape.getPerimeter());


    }
    }

