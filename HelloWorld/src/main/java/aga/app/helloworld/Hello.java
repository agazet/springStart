package aga.app.helloworld;

import org.springframework.stereotype.Component;

import aga.app.runner.Printer;

@Component
public class Hello implements Printer{
	
	private String name;
	
	public Hello(String name){
		this.name = name;
	}
	
	public void print() {
		System.out.println("Hello "+name +"!");
	}
}
