package com.cbs.demo;

public class Beneficiary
{
    private CreditorAccount CreditorAccount;

    private String BeneficiaryId;

    private String AccountId;

    private Servicer Servicer;

    private String Reference;

    public CreditorAccount getCreditorAccount ()
    {
        return CreditorAccount;
    }

    public void setCreditorAccount (CreditorAccount CreditorAccount)
    {
        this.CreditorAccount = CreditorAccount;
    }

    public String getBeneficiaryId ()
    {
        return BeneficiaryId;
    }

    public void setBeneficiaryId (String BeneficiaryId)
    {
        this.BeneficiaryId = BeneficiaryId;
    }

    public String getAccountId ()
    {
        return AccountId;
    }

    public void setAccountId (String AccountId)
    {
        this.AccountId = AccountId;
    }

    public Servicer getServicer ()
    {
        return Servicer;
    }

    public void setServicer (Servicer Servicer)
    {
        this.Servicer = Servicer;
    }

    public String getReference ()
    {
        return Reference;
    }

    public void setReference (String Reference)
    {
        this.Reference = Reference;
    }

    @Override
    public String toString()
    {
        return "{:CreditorAccount"+CreditorAccount+",\n:BeneficiaryId"+BeneficiaryId+",\nAccountId"+AccountId+",\n:Servicer"+Servicer+",\n:Reference"+Reference+"\n}";
    }
}