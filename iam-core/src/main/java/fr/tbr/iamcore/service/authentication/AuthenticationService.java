package fr.tbr.iamcore.service.authentication;

public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		if (username.equals("test") && password.equals("test")) {
			return true;
		} else {
			return false;
		}
	}

}
