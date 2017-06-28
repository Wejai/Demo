package com.cbs.demo;

public class Transactions
{
    private String _rev;

    private Data Data;

    private Links Links;

    private String _id;

    private Meta Meta;

    private String tid;

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

    public String getTid ()
    {
        return tid;
    }

    public void setTid (String tid)
    {
        this.tid = tid;
    }

    @Override
    public String toString()
    {
        return "{rev:"+_rev+",\nid:"+_id+",\n:tid="+tid+",\n:Data"+Data+",\n:Links"+Links+",\n:Meta="+Meta+"\n}";
    }
}

