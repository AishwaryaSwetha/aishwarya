package com.company;

/**
 * Created by Admin on 6/28/2017.
 */
public class Musketeer {
    private String m_name;
    private int m_age;
    public Musketeer(String name,int age)
    {
        this.setname(name);
        this.m_age=age;
    }
    public static final  int defaultage=35;
    public static final String defaultname="chintu";
    public Musketeer()
    {
        this.setname(defaultname);
        this.setage(defaultage);
    }
    public Musketeer(String name)
    {
        this.setname(name);
        this.m_age=defaultage;
    }
    public void setage(int age)
    {
        this.m_age=age;
    }
    public int  getage()
    {
        return m_age;
    }


    public String getname() {
        return m_name;
    }

    public void setname(String m_name) {
        this.m_name = m_name;
    }








}
