package com.cbs.demo;

public class Data
{
    private Account[] Account;
    private Beneficiary[] Beneficiary;
    private Transaction[] Transaction;

    public Transaction[] getTransaction ()
    {
        return Transaction;
    }

    public void setTransaction (Transaction[] Transaction)
    {
        this.Transaction = Transaction;
    }
    
    public Beneficiary[] getBeneficiary ()
    {
        return Beneficiary;
    }

    public Account[] getAccount ()
    {
        return Account;
    }

    public void setAccount (Account[] Account)
    {
        this.Account = Account;
    }
    
    public void setBeneficiary (Beneficiary[] Beneficiary)
    {
        this.Beneficiary = Beneficiary;
    }

    @Override
    public String toString()
    {
    	if (Beneficiary!=null) 
    		return "{:Beneficiary"+Beneficiary+"\n}";
    	else if (Transaction!=null)
    		return "{:Transaction"+Transaction+"\n}";
    	else
    		return "{:Account"+Account+"\n}";
    }
}