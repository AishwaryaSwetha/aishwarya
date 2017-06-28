package com.company;

/**
 * Created by Admin on 6/28/2017.
 */
public class Myrectangle implements Ishape {
    private double m_length;
    private double m_breadth;

    Myrectangle(int length,int breadth)
    {
this.m_length=length;
this.m_breadth=breadth;

    }
    public double getArea()
    {
        return m_length*m_breadth;
    }
    public double getPerimeter()
    {
        return 2*(m_length+m_breadth);
    }

}
