package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;

	// CONSTRUCTOR
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	// INSTANCE METHODS

	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*1;
	}


	public String interpretacion() { 
		return this.interpretacion;
       	}


	public String toString() {
		return this.getOrigen() + "\n" + 
			this.getTitulo() +"\n" + 
			this.getAutor() + "\n" + 
			this.getPaginas() + "\n" +
			this.getEnsenanza();
	}


	// GETTERS & SETTERS
	public String getEnsenanza() { return this.ensenanza; }
	public void setEnsenanza(String ensenanza) { this.ensenanza = ensenanza; }

	public String getInterpretacion() { return this.interpretacion; }
	public void setInterpretacion() { this.interpretacion = interpretacion; }

}
