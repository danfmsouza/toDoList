package br.com.gabrielaedaniel.todoList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielaedaniel.todoList.model.Todo;

public interface TodoRepository extends JpaRepository< Todo, Long > {
	List < Todo > findByNomeDeUsuario(String user);
}
