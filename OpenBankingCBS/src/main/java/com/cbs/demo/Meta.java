package com.cbs.demo;

public class Meta
{
    private String totalpages;

    public String getTotalpages ()
    {
        return totalpages;
    }

    public void setTotalpages (String totalpages)
    {
        this.totalpages = totalpages;
    }

    @Override
    public String toString()
    {
        return "{:totalpages"+totalpages+"\n}";
    }
}