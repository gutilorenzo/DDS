
public class Dispositivo {
	
	private String nombreDispositivo;
	private Boolean encendido;
	private double consumoKwh;
	
	public Dispositivo(String nombre, Boolean encendido, double kwh) {
		
		nombreDispositivo = nombre;
		this.encendido = encendido;
		consumoKwh = kwh;
		
	}
	
	public void cambiarEstado(Boolean nuevoEstado) {
		
		encendido = nuevoEstado;
		
	}

	public String getNombreDispositivo() {
		return nombreDispositivo;
	}

	public void setNombreDispositivo(String nombreDispositivo) {
		this.nombreDispositivo = nombreDispositivo;
	}

	public Boolean getEncendido() {
		return encendido;
	}

	public double getConsumoKwh() {
		return consumoKwh;
	}

	public void setConsumoKwh(double consumoKwh) {
		this.consumoKwh = consumoKwh;
	}
	
		

}
