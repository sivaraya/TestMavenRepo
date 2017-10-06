package com.siva.TestJava;

import javax.swing.JOptionPane;

public class App 
{
	int returnInt(){
		int[] in={1,2,3,4,5};
    	
    	for(int i:in){
    		if(i>3){
    			return i;
    		}
    	}
    	return 0;
	}
	
    public static void main( String[] args )
    {
    	App a=new App();
    	System.out.println(a.returnInt());
    	
    }
}
