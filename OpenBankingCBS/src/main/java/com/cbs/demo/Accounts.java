package com.cbs.demo;

public class Accounts
{
    private String _rev;
    
    private String aid;

    private Data Data;

    private Links Links;

    private String _id;

    private Meta Meta;
    
    public String getaid ()
    {
        return aid;
    }

    public void setaid (String aid)
    {
        this.aid = aid;
    }

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
    
/*    @Override
    public String toString() {
        return "{ id: " + _id + ",\nrev: " + _rev + ",\n:itemId " + itemId
                  + ",\n:reviewer_email " + reviewer_email + ",\n:reviewer_name " + reviewer_name + "\n}";
      }*/

    @Override
    public String toString()
    {
    	return "{rev:"+_rev+",\nid:"+_id+",\n:aid"+aid+"\n:Data"+Data+",\n:Links"+Links+",\n:Meta"+Meta+"\n}";
    }
}