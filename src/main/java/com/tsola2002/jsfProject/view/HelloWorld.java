package com.tsola2002.jsfProject.view;

import javax.faces.bean.ManagedBean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@ManagedBean
@RequestScoped
public class HelloWorld {
	
	private String input;
	private String output;
	
	public void submit() { 
		output = "Hello World! You have typed: " + input; 	
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getOutput() {
		return output;
	}
	
	
	

}
