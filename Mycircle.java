package com.company;

/**
 * Created by Admin on 6/28/2017.
 */
public class Mycircle implements Ishape{
    public static final double pi=3.14;
    private double radius;
public Mycircle(double mradius)
{
    this.radius=mradius;

}
public double getArea()
{
    return pi*radius*radius;
}
public double getPerimeter()
{
    return 2*pi*radius;
}



}
