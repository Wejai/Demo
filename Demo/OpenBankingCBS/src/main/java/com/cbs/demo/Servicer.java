package com.cbs.demo;

public class Servicer
{
    private String Identification;

    private String SchemeName;

    public String getIdentification ()
    {
        return Identification;
    }

    public void setIdentification (String Identification)
    {
        this.Identification = Identification;
    }

    public String getSchemeName ()
    {
        return SchemeName;
    }

    public void setSchemeName (String SchemeName)
    {
        this.SchemeName = SchemeName;
    }

    @Override
    public String toString()
    {
        return "{:Identification"+Identification+",\n:SchemeName"+SchemeName+"\n}";
    }
}
