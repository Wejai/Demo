package com.cbs.demo;

public class ProprietaryBankTransactionCode
{
    private String Issuer;

    private String Code;

    public String getIssuer ()
    {
        return Issuer;
    }

    public void setIssuer (String Issuer)
    {
        this.Issuer = Issuer;
    }

    public String getCode ()
    {
        return Code;
    }

    public void setCode (String Code)
    {
        this.Code = Code;
    }

    @Override
    public String toString()
    {
        return "{:Issuer"+Issuer+",\n:Code"+Code+"\n}";
    }
}
