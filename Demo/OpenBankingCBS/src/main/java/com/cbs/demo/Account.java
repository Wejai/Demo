package com.cbs.demo;

public class Account
{
    private String Nickname;

    private String AccountId;

    private Acc Acc;

    private Servicer Servicer;

    private String Currency;

    public String getNickname ()
    {
        return Nickname;
    }

    public void setNickname (String Nickname)
    {
        this.Nickname = Nickname;
    }

    public String getAccountId ()
    {
        return AccountId;
    }

    public void setAccountId (String AccountId)
    {
        this.AccountId = AccountId;
    }

    public Acc getAcc ()
    {
        return Acc;
    }

    public void setAcc (Acc Acc)
    {
        this.Acc = Acc;
    }

    public Servicer getServicer ()
    {
        return Servicer;
    }

    public void setServicer (Servicer Servicer)
    {
        this.Servicer = Servicer;
    }

    public String getCurrency ()
    {
        return Currency;
    }

    public void setCurrency (String Currency)
    {
        this.Currency = Currency;
    }

    @Override
    public String toString()
    {
        return "{:Nickname"+Nickname+",\n:AccountId"+AccountId+",\n:Acc"+Acc+",\n:Servicer"+Servicer+",\n:Currency"+Currency+"\n}";
    }
}
