package com.cbs.demo;

public class Links
{
    private String self;

    public String getSelf ()
    {
        return self;
    }

    public void setSelf (String self)
    {
        this.self = self;
    }

    @Override
    public String toString()
    {
        return "{:self"+self+"\n}";
    }
}