package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")

public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@PostMapping
	@ResponseBody
	public Livro adicionarLivro(@RequestBody Livro livro) {
		return livroService.salvar(livro);
	}	


}
