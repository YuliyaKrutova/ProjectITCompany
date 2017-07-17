package com.krutova.itcompany.action;

public class IdGenerator {
	private static int idInc;
	
	public static int idInc (){
		return ++idInc;
	}
}
