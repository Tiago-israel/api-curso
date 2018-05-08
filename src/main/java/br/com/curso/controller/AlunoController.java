package br.com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.model.Aluno;
import br.com.curso.service.AlunoService;

@CrossOrigin
@RestController
@RequestMapping("api/alunos")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	@GetMapping
	public List<Aluno> buscarTodos() {
		return this.alunoService.buscarTodos();
	}

	@GetMapping("/{id}")
	public Aluno buscarPorId(@PathVariable("id") Long id) {
		return this.alunoService.buscarPorId(id);
	}

	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return this.alunoService.salvar(aluno);
	}

	@PutMapping("/{id}")
	public Aluno editar(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
		return this.alunoService.editar(id, aluno);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable("id") Long id) {
		this.alunoService.excluir(id);
	}

}
