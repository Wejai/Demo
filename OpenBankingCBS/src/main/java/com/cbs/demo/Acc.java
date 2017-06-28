package com.cbs.demo;

public class Acc
{
    private String Name;

    private String SecondaryIdentification;

    private String Identification;

    private String SchemeName;

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getSecondaryIdentification ()
    {
        return SecondaryIdentification;
    }

    public void setSecondaryIdentification (String SecondaryIdentification)
    {
        this.SecondaryIdentification = SecondaryIdentification;
    }

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
        return "{:Name"+Name+",\n:SecondaryIdentification"+SecondaryIdentification+",\n:Identification"+Identification+",\n:SchemeName"+SchemeName+"\n}";
    }
}

