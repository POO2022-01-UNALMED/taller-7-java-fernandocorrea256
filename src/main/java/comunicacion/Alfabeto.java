package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;

	// CONSTRUCTOR
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	// INSTANCE METHODS
	public int cantidadLetras() {
		return this.getLetras().length;
	}

	public String interpretacion() { 
		return this.interpretacion;
       	}

	public String toString() {
		String[] letras = this.getLetras();
		if(letras.length < 1) {
			return "";
		}
		
		String output = letras[0];
		for (int i = 1; i < letras.length; i++) {
			output += ", " + letras[i];
		}
		return output;
	}

	// GETTERS & SETTERS
	public String[] getLetras() { return this.letras; }
	public void setLetras(String[] letras) { this.letras = letras; }
	
	public String getInterpretacion() { return this.interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }
}
