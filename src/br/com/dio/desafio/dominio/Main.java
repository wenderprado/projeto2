package br.com.dio.desafio.dominio;
import java.time.LocalDate;
public class Main {
	 public static void main(String[] args) {
	Curso curso1 = new Curso();

    curso1.setTitulo("Modulo 1");
    curso1.setDescricao("descri��o curso Iniciante");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Modulo 2");
    curso2.setDescricao("descri��o curso Intermedi�rio");
    curso2.setCargaHoraria(16);
	
    
    Aula aula = new Aula();
    aula.setTitulo("Verb to be");
    aula.setDescricao("descri��o Aula 1");
    aula.setData(LocalDate.now());

    
	//System.out.println(curso1);
    MyEnglishOnline myenglishonline = new MyEnglishOnline();
    myenglishonline.setNome("MyEnglishOnline M�dulo 2");
    myenglishonline.setDescricao("Descri��o MyEnglishOnline M�dulo 2");
    myenglishonline.getConteudos().add(curso2);
    myenglishonline.getConteudos().add(aula);
    
    
    
    Aluno alunoCamila = new Aluno();
    alunoCamila.setNome("Camila");
    alunoCamila.inscreverEnglishOnline(myenglishonline);
    System.out.println("Conte�dos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
    alunoCamila.progredir();
    alunoCamila.progredir();
    System.out.println("-");
    System.out.println("Conte�dos Inscritos Camila:" + alunoCamila.getConteudosInscritos());
    System.out.println("Conte�dos Conclu�dos Camila:" + alunoCamila.getConteudosConcluidos());
    System.out.println("XP:" + alunoCamila.calcularTotalXp());

    System.out.println("-------");
    
    Aluno alunoWender = new Aluno();
    alunoWender.setNome("Wender");
    alunoWender.inscreverEnglishOnline(myenglishonline);
    System.out.println("Conte�dos Inscritos Wender:" + alunoWender.getConteudosInscritos());
    alunoWender.progredir();
    alunoWender.progredir();
    System.out.println("-");
    System.out.println("Conte�dos Inscritos Wend er:" + alunoWender.getConteudosInscritos());
    System.out.println("Conte�dos Conclu�dos Wender:" + alunoWender.getConteudosConcluidos());
    System.out.println("XP:" + alunoWender.calcularTotalXp());

    System.out.println("-------");
    
	 }
}
