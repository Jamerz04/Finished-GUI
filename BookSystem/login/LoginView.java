package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




	public class LoginView {
		
		JPanel loginPanel;
		public LoginController Lcontroller;
		TextField loginUsernameText = new TextField();



		public void loginGui(JFrame tempFrame){

			Lcontroller = new LoginController(this);

			loginPanel = new JPanel();

			loginPanel.setSize(400,500);
			loginPanel.setLayout(null);
			loginPanel.setBackground(new Color(130,203,18));

			tempFrame.add(loginPanel);	

			




			

			JButton loginRegisterBtn = new JButton("Register");
			loginRegisterBtn.setBounds(100,380,90,30);

			loginRegisterBtn.addActionListener(Lcontroller.getRegisterBtn(tempFrame));

			loginPanel.add(loginRegisterBtn);











			JLabel loginUsernameLabel = new JLabel("USERNAME");
			loginUsernameLabel.setBounds(180,130,90,30);
			loginPanel.add(loginUsernameLabel);





			TextField loginUsernameText = new TextField();
			loginUsernameText.setBounds(180,180,90,30);
			loginPanel.add(loginUsernameText);






			JLabel loginPasswordLabel = new JLabel("Password");
			loginPasswordLabel.setBounds(180,220,90,30);
			loginPanel.add(loginPasswordLabel);




			TextField loginPasswordText = new TextField();
			loginPasswordText.setBounds(180,280,90,30);
			loginPanel.add(loginPasswordText);






			JButton loginBtn = new JButton("Login");
			loginBtn.setBounds(180,380,90,30);

			loginBtn.addActionListener(Lcontroller.getLoginBtn(tempFrame,loginUsernameText,loginPasswordText));

			loginPanel.add(loginBtn);








		}
			







	





	}		
