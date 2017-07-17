package com.krutova.itcompany.filemanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.krutova.itcompany.exception.CompanyException;

public class FileManager {
		
	public static ArrayList<String> readLineFromFile(String fileName) throws CompanyException {
        
		String line;
        ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			} 
		}
        catch(IOException  e){
			throw new CompanyException("File is incorrect",e);
		}
        if (lines.isEmpty()){
        	throw new CompanyException("File is empty!");
        }
	return lines;
	}
	
}
