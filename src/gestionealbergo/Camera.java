package gestionealbergo;
import java.util.*;
import java.time.*;

public abstract class Camera {
	private int numero;
	private int Postiletto;
	private Vector<Prenotazione>prenotazioni;
	
	public Camera(int numero, int postiletto) {
		this.numero = numero;
		Postiletto = postiletto;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public int getNumero() {
		return numero;
	}

	public int getPostiletto() {
		return Postiletto;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public boolean isDisponibile(LocalDateTime dal, LocalDateTime al){
		boolean r=false;
		for(int i=0;i<prenotazioni.size();i++){
			if(dal.isBefore(prenotazioni.get(i).getDataArrivo()) || dal.isAfter(prenotazioni.get(i).getDataArrivo()) && al.isBefore(prenotazioni.get(i).getDataArrivo()) || al.isAfter(prenotazioni.get(i).getDataArrivo()));	
			r=true;
		}	
		
		return r;
	}
	
	public void addPrenotazione(Prenotazione p){
		if(this.isDisponibile(p.getDataArrivo(), p.getDataArrivo().plusDays(p.getNumeroNotti()))){
			prenotazioni.add(p);
		}
		else
			throw new IllegalArgumentException("Camera non disponibile");
	}

	@Override
	public String toString() {
		return "Camera [numero=" + numero + ", Postiletto=" + Postiletto
				+ ", prenotazioni=" + prenotazioni + "]";
	}
}
	