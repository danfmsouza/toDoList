package br.com.gabrielaedaniel.todoList.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import br.com.gabrielaedaniel.todoList.model.Todo;

public interface ITodoService {
	
	List< Todo > getTodoByUser(String user);
	Optional< Todo > getTodoById(long id);
	
    void atualizaTodo(Todo todo);
    void adicionaTodo(String name, String desc, Date targetDate, boolean isDone);
    void deletaTodo(long id);
    void salvaTodo(Todo todo);
}
