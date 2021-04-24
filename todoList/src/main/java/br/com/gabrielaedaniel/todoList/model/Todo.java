package br.com.gabrielaedaniel.todoList.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todos")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nomeDoUsuario;
	
	@Size(min = 10, message = "Insira ao menos 10 caracteres...")
	private String descricao;
	private Date targetDate;
	
    public Todo() {
        super();
    }
    
    public Todo(String usuario, String desc, Date targetDate, boolean isDone) {
    	super();
    	this.nomeDoUsuario = usuario;
    	this.descricao = desc;
    	this.targetDate = targetDate;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
    
	
}
