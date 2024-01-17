package com.API.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.API.estoque.model.Produto;

public interface EstoqueRepository extends JpaRepository<Produto, Long>{

}
