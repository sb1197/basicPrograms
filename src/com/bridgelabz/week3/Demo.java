package com.bridgelabz.week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	
		// TODO Auto-generated method stub
		public static void showLines(String fileName, int startLine, int endLine) throws IOException 
		{
			String line = null;
			int currentLineNo = 1;

				BufferedReader in = new BufferedReader (new FileReader(fileName));		
				while(currentLineNo<startLine) 
				{
					if (in.readLine()==null)
					{
						throw new IOException("File too small");
					}
					currentLineNo++;
				}	
				
					//read until endLine
					while(currentLineNo<=endLine) 
					{
						line = in.readLine();
						if (line==null) 
						{
							return;
						}
						System.out.println(line);
						currentLineNo++;
					}					
				
				
		}

		
		public static void main(String[] args) throws IOException 
		{
			//showLines("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/pattern.txt", 1,9);
			//showLines("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/pattern.txt", 11,19);
			showLines("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/pattern.txt", 11,19);

		
		}
		
		
	}
