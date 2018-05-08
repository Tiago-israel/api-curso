package br.com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.curso.model.Aluno;

@Service
public class AlunoService {
	
	private List<Aluno>alunos = new ArrayList<>();
	
	@PostConstruct
	public void onInit() {
		this.alunos.add(new Aluno(1, "tiago", 21, "ADS"));
		this.alunos.add(new Aluno(2, "maria", 33, "ADS"));
		this.alunos.add(new Aluno(3, "joão", 88, "ADS"));
		this.alunos.add(new Aluno(4, "marcia", 77, "ADS"));
		this.alunos.add(new Aluno(5, "josias", 22, "ADS"));
		this.alunos.add(new Aluno(6, "eduardo", 45, "ADS"));
		this.alunos.add(new Aluno(7, "lucia", 40, "ADS"));
	}
	
	public Aluno salvar(Aluno aluno) {
		int count = this.alunos.size();
		aluno.setId(new Long(count+1));
		this.alunos.add(aluno);
		return aluno;
	}
	
	public List<Aluno>buscarTodos(){
		return this.alunos;
	}
	
	public Aluno buscarPorId(long id) {
		return this.alunos.stream()
				.filter(aluno -> aluno.getId() == id)
				.collect(Collectors.toList())
				.stream()
				.findFirst()
				.get();
	}
	
	public Aluno editar(long id, Aluno aluno) {
		Aluno alunoBuscado = this.buscarPorId(id);
		int index = this.alunos.indexOf(alunoBuscado);
		this.alunos.add(index, aluno);
		return aluno;
	}
	
	public void excluir(long id) {
		Aluno aluno = this.buscarPorId(id);
		this.alunos.remove(aluno);
	}
	
}
