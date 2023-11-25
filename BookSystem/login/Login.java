package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;








public class Login{


	public String LoginFileHandling(String getUsername, String getPassword){
		try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\BookSystem\\database\\user.dat"))){

		
			String line;

			while((line = reader.readLine()) != null){
				String[] parts = line.split(", ");
				if (parts.length == 3){
					String username = parts[1];
					String password = parts[2];
					String name = parts[0];


					if (getUsername.equals(username) && getPassword.equals(password)){
						return name;

					}


				}



			}





		}catch (IOException e){
			e.printStackTrace();
			
		}


		return null;


	}












}


