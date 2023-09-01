package com.br.cadalunos.dao;

import org.springframework.data.repository.CrudRepository;

import com.br.cadalunos.modelo.AlunoModelo;

public interface AlunoDAO extends CrudRepository <AlunoModelo, Integer>{

    
}
