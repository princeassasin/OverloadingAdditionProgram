package com.example.overloading.java;

public class OverloadingAdditionProgram {

	public int add(int v1, int v2){

		return v1+v2;
	}


		public double add(double v1, double v2){

		return v1+v2;
	}

		public double add(int v1, double v2){

		return v1+v2;
	}
	public static void main(String[] args) {
	
		

		OverloadingAdditionProgram add = new OverloadingAdditionProgram();

		System.out.println("Addition for:"+add.add(10, 20));	
		System.out.println("Addition for:"+add.add(10, 20));	
		System.out.println("Addition for:"+add.add(10, 20));	

	}
	}


