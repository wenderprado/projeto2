package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int CargaHoraria;
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Curso()
	{		
	}
	
	public int getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", CargaHoraria=" + CargaHoraria + "]";
	}


	

}
