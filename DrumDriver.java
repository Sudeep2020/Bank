package com.niit.drum;
public class DrumDriver
{
	public static void main(String[] args)
	{
    Drum input=new Drum(5,12,15);
    Drum input1=new Drum(50,50,50);
    int res=input.compare(input1);
    System.out.println(res);
    }   
}