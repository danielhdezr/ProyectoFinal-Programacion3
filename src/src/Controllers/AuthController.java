package Controllers;

import Views.AuthView;

public class AuthController {
	
	public AuthView vista;

	public AuthController() {
		// TODO Auto-generated constructor stub
		vista = new AuthView();
	}
	
	public void login() {
    	
    	vista.loginPanel();
    }
	
	public void registro() {
		
		vista.registroPanel();;
	}

}
