package com.demo.thread;

public class Demo1_Singleton{
		public static void main(String[] args){
		//Singleton s1=Singleton.s;
		//Singleton.s=null;
		//Singleton s2=Singleton.s;
		//System.out.println(S1==s2);
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(S1==s2);
		}
}
/*Eager initialization
In eager initialization, the instance of Singleton Class is created 
at the time of class loading, this is the easiest method to create a singleton class 
but it has a drawback that instance is created even though client application might not be using it.*/
class Singleton{
	private Singleton(){}	
	//public static Singleton s=new Singleton();
	private static Singleton s =new Singleton();
	public static Singleton getInstance(){
		return s;
	}
	public static void print(){
		System.out.println("111111");
}

/*Lazy initialization
Lazy initialization method to implement Singleton pattern creates the instance 
in the global access method. Here is the sample code for creating Singleton class 
with this approach.*/
class Singleton{
	private Singleton(){}
	private static Singleton s;
	public static Singleton getInstance(){
		if(s==null)
			s=new Singleton();
		return s;
	}
	public static void print(){
		System.out.println("1111")
	}
}

