package org.overloading;

public class OverLoading {
	public void details(String Name) {
System.out.println("Name is : "+Name);
}
	public void details(int Age, long MobileNo) {
System.out.println("Age is: "+Age);
System.out.println("Moblie no. is: "+MobileNo);
}
public static void main(String[] args) {
	OverLoading o= new OverLoading();
	o.details("Anisha");
	o.details(24, 8610219734l);
}
}
