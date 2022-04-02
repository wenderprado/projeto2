package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Aula extends Conteudo {

	private String titulo;
	private String descricao;
	private LocalDate data;
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	public Aula() {
	
	}
	
	
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
	
	
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }



}
	



