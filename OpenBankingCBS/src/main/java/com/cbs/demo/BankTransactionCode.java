package com.cbs.demo;

public class BankTransactionCode {
	private String SubCode;

    private String Code;

    public String getSubCode ()
    {
        return SubCode;
    }

    public void setSubCode (String SubCode)
    {
        this.SubCode = SubCode;
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
        return "{:SubCode"+SubCode+",\n:Code"+Code+"\n}";
    }
}
