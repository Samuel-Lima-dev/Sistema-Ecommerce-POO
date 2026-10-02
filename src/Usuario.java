
public class Usuario {
	
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	
	public Usuario(String nome, String email, String cpf) {	
		setNome(nome);
		setEmail(email);
		setCpf(cpf);
	}
	
	public Usuario(String nome, String email, String cpf, String telefone) {
		setNome(nome);
		setEmail(email);
		setCpf(cpf);
		setTelefone(telefone);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
