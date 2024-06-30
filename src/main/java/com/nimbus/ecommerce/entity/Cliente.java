package com.nimbus.ecommerce.entity;

import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@NotBlank(message = "O campo 'cpf' é obrigatório")
	private String cpf; 
	
	@NotBlank(message = "O campo 'nome' é obrigatório")
	private String nome;
	
	@NotBlank(message = "O campo 'apelido' é obrigatório")
	private String apelido;
	
	@NotBlank(message = "O campo 'genero' é obrigatório")
	private String genero;
	
	@NotBlank(message = "O campo 'email' é obrigatório")
	@Email(message = "Deve ser um email válido")
	private String email;
	
	@NotBlank(message = "O campo 'telefone' é obrigatório")
	private String telefone;
	
	@NotBlank(message = "O campo 'cep' é obrigatório")
	private String cep;
	
	@NotBlank(message = "O campo 'senha' é obrigatório")
	private String senha;
	
}
