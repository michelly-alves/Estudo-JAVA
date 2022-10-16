
public class Contatos {
	private String Name;
	private String Telefone;
	private String Email;
	
	
	public Contatos(String Name, String Telefone, String Email) {
		this.setName(Name);
		this.setTelefone(Telefone);
		this.setEmail(Email);
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getTelefone() {
		return Telefone;
	}


	public void setTelefone(String telefone) {
		Telefone = telefone;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}
	
	
}
