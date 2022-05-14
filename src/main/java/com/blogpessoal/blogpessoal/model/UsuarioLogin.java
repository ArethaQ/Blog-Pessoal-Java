package com.blogpessoal.blogpessoal.model;

public class UsuarioLogin {
	
	private Long id;
	
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String foto;
	
	private String token;
	
	private String tipo;
	
	//criar gets e sets

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//criar estes construtores abaixo (o com todos e o vazio) antes de criar o usuario controller test
	//gerando construtores source>generate constructor using fields>marca todos
	public UsuarioLogin(Long id, String nome, String usuario, String senha, String foto, String tipo, String token) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.foto = foto;
		this.tipo = tipo;
		this.token = token;
	}

	//gerando construtor vazio source>generate constructor using fields>desmarca todos e gera
	public UsuarioLogin() {
		super();
	}
	
	
	
}
