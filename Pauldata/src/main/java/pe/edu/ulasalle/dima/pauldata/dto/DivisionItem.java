package pe.edu.ulasalle.dima.pauldata.dto;

public class DivisionItem {
	
	protected String titulo;
	protected String contenido;
	protected DivisionItem item;
	
	DivisionItem() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public DivisionItem getItem() {
		return item;
	}

	public void setItem(DivisionItem item) {
		this.item = item;
	}
	
	
}
