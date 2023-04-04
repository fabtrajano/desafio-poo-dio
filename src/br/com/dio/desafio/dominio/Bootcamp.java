package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private LocalDateTime dataInicial = LocalDateTime.now();
	private final LocalDateTime dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Set<Dev> getDevInscritos() {
		return devInscritos;
	}
	public void setDevInscritos(Set<Dev> devInscritos) {
		this.devInscritos = devInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDateTime getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataFinal, dataInicial, descricao, devInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(dataFinal, other.dataFinal) && Objects.equals(dataInicial, other.dataInicial)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(devInscritos, other.devInscritos)
				&& Objects.equals(nome, other.nome);
	}
	
	
}
