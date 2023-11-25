package book.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;
import book.system.register.RegisterView;



	public class GuiFrames extends JFrame{
		public LoginView loginView;
		public RegisterView registerView;
		

		public GuiFrames(){

				
			

			setTitle("Book System");
			setLayout(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,500);


			registerView = new RegisterView();
			loginView = new LoginView();


			
			loginView.loginGui(this);

			setVisible(true);







		}





	}