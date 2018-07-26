package com.niit.Inverse;
public class InverseDriver
{
	public static void main(String[] args)
	{
    Inverse str_check=new Inverse("Mudita");
    Inverse str_check1=new Inverse("helllo");
    Boolean check=str_check.equals(str_check1);
    System.out.println(check);
	}
}