package com.example.cursomc.repositories;

import com.example.cursomc.domain.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {

}
