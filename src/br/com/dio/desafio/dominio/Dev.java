package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo>conteudo = this.conteudosInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			
			this.conteudosInscrito.remove(conteudo.get());
		}else {
			System.out.println("Voce nao esta matriculado em nenhum conteudo!");
		
		}
			
		
	}
	public double calcularTotalXp() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscrito() {
		return conteudosInscrito;
	}

	public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
		this.conteudosInscrito = conteudosInscrito;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscrito, other.conteudosInscrito) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}
