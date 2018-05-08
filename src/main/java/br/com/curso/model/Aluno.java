package br.com.curso.model;

public class Aluno {
	private Long id;
	private String nome;
	private int idade;
	private String curso;
	
	public Aluno() {}

	public Aluno(long id, String nome, int idade, String curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
