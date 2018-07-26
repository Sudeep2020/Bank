package com.niit.Inverse;
public class Inverse{
private String str;
public String getStr()
    {
        return str;
    }
public void setStr(String str)
    {
        this.str = str;
    }
public Inverse(String str)
    {
    	this.str=str;
    }
public String inverse(String s1)
    {
    	StringBuffer sb= new StringBuffer();
    	sb.append(s1);
    	sb=sb.reverse();
    	String str1=sb.toString();
    	return str1;
    }
public boolean equals(Object o)
	{
     	Inverse s= (Inverse)o;
     	String str_eql1=s.getStr();
     	System.out.println(str_eql1);
     	String s4=inverse(str_eql1);
     	String s5=inverse(str);
     	System.out.println(s4);
     	System.out.println(s5);
     	char [] data_list= s4.toCharArray();
     	int length1=s4.length();
     	int length2=s5.length();
     	char [] data_list1= s5.toCharArray();
     	for(int i=0;i<length1;i=i+2)
     	{
          if(length1==length2){
          if(data_list[i]==data_list1[i])
          {
              return true;
          }
        }
        break;
     }
   return false;
   }
}