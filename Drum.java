package com.niit.drum;
public class Drum
{
    private int br,lg,ht;
    public Drum(int br,int lg,int ht)
    {
        this.lg=lg;
        this.br=br;
        this.ht=ht;
    }
    public int getLg()
    {
        return lg;
    }
    public void setLg(int lg)
    {
        this.lg = lg;
    }
    public int getBr()
    {
        return br;
    }
    public void setBr(int br)
    {
        this.br = br;
    }
    public int getHt()
    {
        return ht;
    }
    public void setHeight(int ht)
    {
        this.ht = ht;
    }
    public int volume(int br,int lg,int ht)
    {
    	return lg*br*ht;
    }
    public int compare(Drum has)
    {
    	int result,volume1=volume(lg,br,ht);
    	int volume2=volume(has.getLg(),has.getBr(),has.getHt());
    	if(volume1>=volume2)
    	{
    		result=volume1-volume2;
    		return result;
    	}
    	return 0;
    }
}