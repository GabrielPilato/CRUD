package funtec.CRUD.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import funtec.CRUD.model.Funcionario;
import funtec.CRUD.model.FuncionarioSetor;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

	List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
	
}
