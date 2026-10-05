package usuario;
import exceptions.DadosInvalidosException;

public class Usuario {
	
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	
	public Usuario(String nome, String email, String cpf) {	
		this(nome, email,cpf, null);
		
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
		if(nome == null || nome.isEmpty()) {
			throw new DadosInvalidosException("Nome não pode está em branco");
		}
		this.nome = nome;
		
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		if(email == null || email.isEmpty() ) {
			throw new DadosInvalidosException("Email não é válido.");
		}
		this.email = email;
		
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(cpf == null || cpf.isEmpty() || cpf.length() != 11) {
			throw new DadosInvalidosException("Cpf Inválido!");
		}
		this.cpf = cpf;
		
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
