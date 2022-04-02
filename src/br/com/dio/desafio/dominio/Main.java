package br.com.dio.desafio.dominio;
import java.time.LocalDate;
public class Main {
	 public static void main(String[] args) {
	Curso curso1 = new Curso();

    curso1.setTitulo("Modulo 1");
    curso1.setDescricao("descrição curso Iniciante");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Modulo 2");
    curso2.setDescricao("descrição curso Intermediário");
    curso2.setCargaHoraria(16);
	
    
    Aula aula = new Aula();
    aula.setTitulo("Verb to be");
    aula.setDescricao("descrição Aula 1");
    aula.setData(LocalDate.now());

    
	//System.out.println(curso1);
    MyEnglishOnline myenglishonline = new MyEnglishOnline();
    myenglishonline.setNome("MyEnglishOnline Módulo 2");
    myenglishonline.setDescricao("Descrição MyEnglishOnline Módulo 2");
    myenglishonline.getConteudos().add(curso2);
    myenglishonline.getConteudos().add(aula);
    
    
    
    Aluno alunoCamila = new Aluno();
    alunoCamila.setNome("Camila");
    alunoCamila.inscreverEnglishOnline(myenglishonline);
    System.out.println("Conteúdos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
    alunoCamila.progredir();
    alunoCamila.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Camila:" + alunoCamila.getConteudosConcluidos());
    System.out.println("XP:" + alunoCamila.calcularTotalXp());

    System.out.println("-------");
    
    Aluno alunoWender = new Aluno();
    alunoWender.setNome("Wender");
    alunoWender.inscreverEnglishOnline(myenglishonline);
    System.out.println("Conteúdos Inscritos Wender:" + alunoWender.getConteudosInscritos());
    alunoWender.progredir();
    alunoWender.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Wend er:" + alunoWender.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Wender:" + alunoWender.getConteudosConcluidos());
    System.out.println("XP:" + alunoWender.calcularTotalXp());

    System.out.println("-------");
    
	 }
}
