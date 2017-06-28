package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

Musketeer m1=new Musketeer("swetha",57);
Musketeer m2=new Musketeer("amma");
Musketeer m3=new Musketeer();
List<Musketeer> musketeer=new ArrayList<>();
musketeer.add(m1);
musketeer.add(m2);
musketeer.add(m3);
for(Musketeer m:musketeer)
{
    System.out.println("name of  musketeers "+ m.getname()+"value are "+m.getage());
}
    }
}
