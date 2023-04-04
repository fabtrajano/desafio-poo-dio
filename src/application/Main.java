package application;

import java.time.LocalDateTime;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("Descricao mentoria java");
		mentoria.setData(LocalDateTime.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao(" Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFabricio = new Dev();
		devFabricio.setNome("Fabricio");
		devFabricio.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos "+devFabricio.getNome()+": " + devFabricio.getConteudosInscrito());
		devFabricio.progredir();
		devFabricio.progredir();
		devFabricio.progredir();
		
		
		System.out.println("Conteudos Inscritos "+devFabricio.getNome()+": "  + devFabricio.getConteudosInscrito());
		System.out.println("Conteudos concluidos "+devFabricio.getNome()+": "  + devFabricio.getConteudosConcluidos());
		System.out.println("XP" + devFabricio.calcularTotalXp());
		
		
		
		System.out.println("---------------------------------------------------------------------------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos "+devCamila.getNome()+": "  + devCamila.getConteudosInscrito());
		devCamila.progredir();
		System.out.println("Conteudos Inscritos "+devCamila.getNome()+": "  + devCamila.getConteudosInscrito());
		System.out.println("Conteudos Concluidos "+devCamila.getNome()+": "  + devCamila.getConteudosConcluidos());
		System.out.println("XP " + devCamila.calcularTotalXp());
		
	}

}
