package metier;

/**
 * @author adminl
 * La classe conseiller est présente afin de se connecter sur l'application en tant qu'utilisateur
 */
public class Conseiller {
	
	private String login, password;

	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
