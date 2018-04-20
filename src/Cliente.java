

public class Cliente extends Usuario{

	private String tipoDni;
	private String numeroDni;
	private String telefonoContacto;
	private String categoria;
	private Dispositivo Dispositivos[];
	
	
	
	public Boolean estaEncendido(Dispositivo unDispositivo) {
		
		return unDispositivo.getEncendido();
		
	}
	
	public int cantidadEncendidos() {
		
		Dispositivo aux[];
		
		aux = Dispositivos.filter(x -> !Dispositivos.equals("encendido"));
		
		
		return aux.length;
	}
	
	public int cantidadDeDispositivos() {
		
		return Dispositivos.length;
		
	}
	
	
}
