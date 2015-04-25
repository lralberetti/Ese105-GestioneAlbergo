package gestionealbergo;
import java.time.LocalDateTime;
public class Prenotazione {
	private int numeroNotti;
	private LocalDateTime DataArrivo;
	private Cliente cliente;
	private Camera camera;
	
	public Prenotazione(int numeroNotti,
			LocalDateTime dataArrivo, Cliente cliente, Camera camera) {
		this.numeroNotti = numeroNotti;
		DataArrivo = dataArrivo;
		this.cliente = cliente;
		this.camera = camera;
	}
	
	public LocalDateTime getDataArrivo() {
		return DataArrivo;
	}
	
	public int getNumeroNotti() {
		return numeroNotti;
	}
	
	public void setNumeroNotti(int numeroNotti) {
		if(numeroNotti <=0)
			throw new IllegalArgumentException("NumeroNotti deve essere positivo");
		this.numeroNotti = numeroNotti;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		if(cliente== null)	
			throw new IllegalArgumentException("Cliente non può essere null");

		this.cliente = cliente;
	}
	
	public Camera getCamera() {
		return camera;
	}
	
	public void setCamera(Camera camera) {
		if(camera==null)
			throw new IllegalArgumentException("Camera non può essere null");
		this.camera = camera;
	}	
	
}
