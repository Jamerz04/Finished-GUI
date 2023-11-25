package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.register.RegisterView;



public class LoginController{

		public RegisterView registerView = new RegisterView();

		private LoginView loginView;
		private Login login;

		public LoginController(LoginView loginView){

			this.loginView = loginView;
			this.login = new Login();




		}



	public ActionListener getRegisterBtn(JFrame registerFrame){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){

				registerFrame.getContentPane().removeAll();
				registerFrame.repaint();
				registerView.registerGui(registerFrame);

				JOptionPane.showMessageDialog(null,"RegsterBtn");
				

			}



			
		};

	}




	public ActionListener getLoginBtn(JFrame tempFrame, TextField username, TextField password){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){

				String getUsername = username.getText();
				String getPassword = password.getText();


				if(getUsername.isEmpty() || getPassword.isEmpty()){
					
				
				}


				String displayName = login.LoginFileHandling(getUsername,getPassword);



				if (displayName != null){
					


					JOptionPane.showMessageDialog(null,"Success!");
				}


				else{
					JOptionPane.showMessageDialog(null,"Incorrect Password or Username!");
				}



				

			}



			
		};

	}









}