package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

	public Livro salvar(Livro livro) {
		// TODO Auto-generated method stub
		return repository.save(livro);
	}
	@Autowired
	private LivroRepository repository;
	

	/*
	 * @PostMapping
	 * 
	 * @ResponseBody public Livro adicionarLivro(@RequestBody Livro livro) { return
	 * repository.save(livro); }
	 */
}


