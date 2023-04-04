package application;

import java.time.LocalDateTime;

import br.com.dio.desafio.dominio.Conteudo;

public class Mentoria extends Conteudo{
	
	
	private LocalDateTime data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria() {
	}
	
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "[titulo do "+getTitulo()+", "+getDescricao()+", data=" + data + "]";
	}

	
	
}
