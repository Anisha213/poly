package org.overriding;

public class Extended extends Overriding{
@Override
public void name(String CompanyName) {
	System.out.println("Name is :"+CompanyName);
}
@Override
	public void age(int Id) {
System.out.println("Id is :"+Id);
}
public static void main(String[] args) {
	Extended e= new Extended();
	e.age(14495);
	e.name("TNQ Tech");
}
}
