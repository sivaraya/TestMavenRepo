package com.siva.TestJava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FindPathOfFile {

	public static void main(String[] args) {
		File currentDir = new File("."); // current directory
		System.out.println(currentDir.getAbsolutePath());
		displayDirectoryContents(currentDir);

	}

	private static void displayDirectoryContents(File currentDir) {
		
		
		
		File[] files = currentDir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				displayDirectoryContents(file);
			} else {
				if (file.getName().equals("App.html")) {
					try {
						System.out.println(file.getAbsolutePath());
						String content = "";
						 
				        try
				        {
				            content = new String ( Files.readAllBytes( Paths.get(file.getAbsolutePath())));
				            String[] per = content.split("%");
				            String[] percentage=per[0].split(">");
				            System.out.println(percentage[percentage.length - 1]);
				        }
				        catch (IOException e)
				        {
				            e.printStackTrace();
				        }
				 
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
