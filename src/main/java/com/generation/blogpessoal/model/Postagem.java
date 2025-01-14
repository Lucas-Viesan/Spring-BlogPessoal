package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity  // Indica que a classe é uma tabela
@Table(name = "tb_postagem") // Indica o nome da tabela no bd
public class Postagem {
	
	@Id // Ele é a chave privada(PRIMARY KEY)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Ele é o AUTO_INCREMENT
	private Long id;
	
	@NotBlank(message = "O atributo título é obrigatório")
	@Size (min = 5, max = 100, message = "O atributo título deve conter no minímo 5 e no máximo 100 caracters")
	private String titulo;
	
	@NotBlank(message = "O atributo título é obrigatório")
	@Size (min = 5, max = 1000, message = "O atributo título deve conter no minímo 5 e no máximo 1000 caracters")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
		
	
}
