package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




	public class RegisterView {
		
		JPanel registerPanel;
		public RegisterController rController;



		public void registerGui(JFrame tempFrame){

			rController = new RegisterController(this);

			registerPanel = new JPanel();

			registerPanel.setSize(400,500);
			registerPanel.setLayout(null);
			registerPanel.setBackground(new Color(23,224,180));

			tempFrame.add(registerPanel);	

			




			






			








			JLabel registerNameLabel = new JLabel("NAME");
			registerNameLabel.setBounds(180,40,90,30);
			registerPanel.add(registerNameLabel);




			TextField registerNameText = new TextField();
			registerNameText.setBounds(180,80,90,30);
			registerPanel.add(registerNameText);
			










			JLabel registerUsernameLabel = new JLabel("USERNAME");
			registerUsernameLabel.setBounds(180,130,90,30);
			registerPanel.add(registerUsernameLabel);



			TextField registerUsernameText = new TextField();
			registerUsernameText.setBounds(180,180,90,30);
			registerPanel.add(registerUsernameText);
		








			JLabel registerPasswordLabel = new JLabel("Password");
			registerPasswordLabel.setBounds(180,220,90,30);
			registerPanel.add(registerPasswordLabel);


			TextField registerPasswordText = new TextField();
			registerPasswordText.setBounds(180,280,90,30);
			registerPanel.add(registerPasswordText);

		






















			JButton registerBtn = new JButton("Register");
			registerBtn.setBounds(100,380,90,30);

			registerBtn.addActionListener(rController.getRegisterBtn(tempFrame,registerNameText,registerUsernameText,registerPasswordText));

			registerPanel.add(registerBtn);








			JButton cancelBtn = new JButton("Cancel");
			cancelBtn.setBounds(180,380,90,30);

			cancelBtn.addActionListener(rController.getCancelBtn(tempFrame));

			registerPanel.add(cancelBtn);

		}
			


		



	





	}		
