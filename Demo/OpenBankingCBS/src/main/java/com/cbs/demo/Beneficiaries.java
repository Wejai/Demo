package com.cbs.demo;

public class Beneficiaries
{
    private String _rev;

    private Data Data;

    private Links Links;

    private String _id;

    private Meta Meta;

    private String bid;

    public String get_rev ()
    {
        return _rev;
    }

    public void set_rev (String _rev)
    {
        this._rev = _rev;
    }

    public Data getData ()
    {
        return Data;
    }

    public void setData (Data Data)
    {
        this.Data = Data;
    }

    public Links getLinks ()
    {
        return Links;
    }

    public void setLinks (Links Links)
    {
        this.Links = Links;
    }

    public String get_id ()
    {
        return _id;
    }

    public void set_id (String _id)
    {
        this._id = _id;
    }

    public Meta getMeta ()
    {
        return Meta;
    }

    public void setMeta (Meta Meta)
    {
        this.Meta = Meta;
    }

    public String getbid ()
    {
        return bid;
    }

    public void setbid (String bid)
    {
        this.bid = bid;
    }

    @Override
    public String toString()
    {
        return "{_rev:"+_rev+",\n_id:"+_id+",\n:bid"+bid+",\n:Data"+Data+",\n:Links"+Links+",\n:Meta"+Meta+"\n}";
    }
}