package com.cbs.demo;

public class Transaction {
	private String TransactionId;

    private String Status;

    private Amount Amount;

    private BankTransactionCode BankTransactionCode;

    private String TransactionInformation;

    private String ValueDateTime;

    private String AccountId;

    private ProprietaryBankTransactionCode ProprietaryBankTransactionCode;

    private String CreditDebitIndicator;

    private Balance Balance;

    private String BookingDateTime;

    private String TransactionReference;

    public String getTransactionId ()
    {
        return TransactionId;
    }

    public void setTransactionId (String TransactionId)
    {
        this.TransactionId = TransactionId;
    }

    public String getStatus ()
    {
        return Status;
    }

    public void setStatus (String Status)
    {
        this.Status = Status;
    }

    public Amount getAmount ()
    {
        return Amount;
    }

    public void setAmount (Amount Amount)
    {
        this.Amount = Amount;
    }

    public BankTransactionCode getBankTransactionCode ()
    {
        return BankTransactionCode;
    }

    public void setBankTransactionCode (BankTransactionCode BankTransactionCode)
    {
        this.BankTransactionCode = BankTransactionCode;
    }

    public String getTransactionInformation ()
    {
        return TransactionInformation;
    }

    public void setTransactionInformation (String TransactionInformation)
    {
        this.TransactionInformation = TransactionInformation;
    }

    public String getValueDateTime ()
    {
        return ValueDateTime;
    }

    public void setValueDateTime (String ValueDateTime)
    {
        this.ValueDateTime = ValueDateTime;
    }

    public String getAccountId ()
    {
        return AccountId;
    }

    public void setAccountId (String AccountId)
    {
        this.AccountId = AccountId;
    }

    public ProprietaryBankTransactionCode getProprietaryBankTransactionCode ()
    {
        return ProprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode (ProprietaryBankTransactionCode ProprietaryBankTransactionCode)
    {
        this.ProprietaryBankTransactionCode = ProprietaryBankTransactionCode;
    }

    public String getCreditDebitIndicator ()
    {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator (String CreditDebitIndicator)
    {
        this.CreditDebitIndicator = CreditDebitIndicator;
    }

    public Balance getBalance ()
    {
        return Balance;
    }

    public void setBalance (Balance Balance)
    {
        this.Balance = Balance;
    }

    public String getBookingDateTime ()
    {
        return BookingDateTime;
    }

    public void setBookingDateTime (String BookingDateTime)
    {
        this.BookingDateTime = BookingDateTime;
    }

    public String getTransactionReference ()
    {
        return TransactionReference;
    }

    public void setTransactionReference (String TransactionReference)
    {
        this.TransactionReference = TransactionReference;
    }

    @Override
    public String toString()
    {
        return "{:TransactionId"+TransactionId+",\n:Status"+Status+",\n:Amount"+Amount+",\n:BankTransactionCode"+BankTransactionCode+",\n:TransactionInformation"+TransactionInformation+",\n:ValueDateTime"+ValueDateTime+",\n:AccountId"+AccountId+",\n:ProprietaryBankTransactionCode"+ProprietaryBankTransactionCode+",\n:CreditDebitIndicator"+CreditDebitIndicator+",\n:Balance"+Balance+",\n:BookingDateTime"+BookingDateTime+",\n:TransactionReference"+TransactionReference+"\n}";
    }
}
