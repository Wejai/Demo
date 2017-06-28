package com.cbs.demo;

public class Balance {
	private Amount Amount;

    private String Type;

    private String CreditDebitIndicator;

    public Amount getAmount ()
    {
        return Amount;
    }

    public void setAmount (Amount Amount)
    {
        this.Amount = Amount;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public String getCreditDebitIndicator ()
    {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator (String CreditDebitIndicator)
    {
        this.CreditDebitIndicator = CreditDebitIndicator;
    }

    @Override
    public String toString()
    {
        return "{:Amount"+Amount+",\n:Type"+Type+",\n:CreditDebitIndicator"+CreditDebitIndicator+"\n}";
    }
}
